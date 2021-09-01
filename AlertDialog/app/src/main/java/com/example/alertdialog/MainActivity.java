package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder alert;
    private  String secim="Seçtikleriniz";

    private String[] isletimSistemleri={"Windows 10","Windows 98","Windows Xp","Windows 7"};
     private  boolean[] secimler={true,false,true,true};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
    }

    public  void normalAlert(View v){
        AlertDialog.Builder alert=new AlertDialog.Builder (this);
        alert.setTitle ("Kütüphane Otomasyonu");
        alert.setMessage ("Uygumadan Çıkacan mı");
        alert.setCancelable (false);
        alert.setIcon (R.mipmap.ic_launcher);
        alert.setPositiveButton ("Hayır", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                 dialog.dismiss ();

            }
        });
        alert.setNegativeButton ("Evet", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (getApplicationContext (),"Çıkışa bastın",Toast.LENGTH_SHORT).show ();

            }
        });
        alert.show ();
    }


    public  void  ozelAlert(View v){

        alert=new AlertDialog.Builder (this);
        alert.setTitle ("İşletim Sistemi Tür Tercihinizi Seçiniz");
        DialogInterface.OnMultiChoiceClickListener listener=new DialogInterface.OnMultiChoiceClickListener () {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if (b){
                    secim+=isletimSistemleri[i]+"\n";
                    Toast.makeText (getApplicationContext (),isletimSistemleri[i],Toast.LENGTH_SHORT).show ();

                }
            }
        };
        alert.setMultiChoiceItems (isletimSistemleri,secimler,listener);
        alert.setPositiveButton ("Tamam", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText (getApplicationContext (),secim,Toast.LENGTH_SHORT).show ();
                secim="";
            }

        });
        alert.show ();

    }








}