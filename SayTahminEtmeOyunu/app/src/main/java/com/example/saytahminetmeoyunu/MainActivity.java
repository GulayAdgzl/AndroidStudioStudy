package com.example.saytahminetmeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtKalanHak,txtSonuc;
    private EditText editTxtSayi;

    private String gelenDeger;
    private int kalanHak=3,randomSayi;
    private Random rndNumber;
    private boolean tahminDogrumu=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        editTxtSayi=(EditText)findViewById (R.id.txtViewKalanHak);
        txtSonuc=(TextView)findViewById (R.id.txtViewSonuc);
        editTxtSayi=(EditText)findViewById (R.id.editTxtSayı) ;

        rndNumber=new Random ();
        randomSayi=rndNumber.nextInt (5);
        System.out.println ("Random Sayı"+randomSayi);


    }
    public void btnTahminEt(View v){
        gelenDeger=editTxtSayi.getText ().toString ();
        if (!TextUtils.isEmpty (gelenDeger)){
            if (kalanHak>0 && tahminDogrumu==false){
                if (gelenDeger.equals (String.valueOf (randomSayi))){
                    sonucGoster("Tebrikler Doğru Tahminde Bulundun");
                    tahminDogrumu=true;
                }
                else {

                    txtSonuc.setText ("Yanlış Tahminde Bulundunuz");
                    editTxtSayi.setText ("");
                }
                kalanHak--;
                txtKalanHak.setText ("Kalan Hak"+kalanHak);

                if (kalanHak==0 && tahminDogrumu==false){
                    sonucGoster("Tahmin Hakkınız Bitti");
                    editTxtSayi.setText ("");
                }
               else
                   txtSonuc.setText ("Oyun Bitti");
            }
            else
                txtSonuc.setText ("Girilen Değer Boş Olamaz");
        }
    }

    private void sonucGoster(String mesaj) {
        editTxtSayi.setEnabled (false);
        txtSonuc.setText (mesaj);
    }
}