package com.example.sqlte;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.security.cert.Extension;


public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


        try {

            database=this.openOrCreateDatabase ("Okul",MODE_PRIVATE,null);
            database.execSQL ("CREATE TABLE IF NOT EXISTS Ogrenciler(ad VARCHAR,soyad VARCHAR,ogrenci_no INT)");



        }catch (Exception e){
            e.printStackTrace ();
        }
    }

    public  void sqliteBtnClick(View v){
        switch (v.getId ()){
            case R.id.btnEkle:
                try {

                    database.execSQL ("INSERT INTO Ogrenciler(ad,soyad,ogrenci_no) VALUES('Gülay','ADIGÜZEL',234) ");
                    getData ();
                    Toast.makeText (getApplicationContext (),"Kayıt Başarıyla Yüklendi",Toast.LENGTH_SHORT).show ();
                }
                catch (Exception e){
                    e.printStackTrace ();
                }
                break;
            case R.id.btnGüncelle:

                try {
                    database.execSQL ("UPDATE Ogrenciler SET ogrenci_no=64 WHERE ad='Gülay' AND soyad='ADIGÜZEL'");
                    getData ();
                    Toast.makeText (getApplicationContext (),"Kayıt Başarıyla Güncellendi",Toast.LENGTH_SHORT).show ();

                }catch (Exception e){
                    e.printStackTrace ();
                }

                break;
            case R.id.btnSil:
               try {
                   database.execSQL ("DELETE FROM Ogrenciler WHERE soyad='ADIGÜZEL'");
                   getData ();
                   Toast.makeText (getApplicationContext (),"Kayıt Başarıyla Silindi",Toast.LENGTH_SHORT).show ();

               }
               catch (Exception e){
                   e.printStackTrace ();
               }

                break;
            case R.id.btnTabloyuSil:
                try {
                    database.execSQL ("DROP TABLE Ogrenciler");
                    getData ();
                    Toast.makeText (getApplicationContext (),"Tablo Silindi",Toast.LENGTH_SHORT).show ();
                }
                catch (Exception e){
                    e.printStackTrace ();
                }
                break;

        }
    }
    private void getData(){
        Cursor cursor=database.rawQuery ("SELECT * FROM Ogrenciler",null );
        int adIndex=cursor.getColumnIndex ("ad");
        int soyadIndex=cursor.getColumnIndex ("soyad");
        int ogrenciNoIndex =cursor.getColumnIndex ("ogrenci_no");

        while (cursor.moveToNext ())
            System.out.println ("Ad="+cursor.getString (adIndex)+"Soyad"+cursor.getString (soyadIndex)+"Ogrenci No"+cursor.getInt (ogrenciNoIndex));

        cursor.close ();
    }


}