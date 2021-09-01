package com.example.yasamdonguler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        System.out.println ("onCreate Çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume ();
        System.out.println ("onResume Çalıştı");
    }

    @Override
    protected void onStart() {
        super.onStart ();
        System.out.println ("onStart Çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy ();
        System.out.println ("onDestroy Çalıştı");
    }

    @Override
    protected void onPause() {
        super.onPause ();
        System.out.println ("onPause çalıştı");
    }

    @Override
    protected void onRestart() {
        super.onRestart ();
        System.out.println ("onResart Çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop ();
        System.out.println ("onStop Çalıştı");
    }
    public  void  ikinciActivite(View v){
        Intent intent=new Intent (this,MainActivity2.class);
        finish ();
        startActivity (intent);
    }

}