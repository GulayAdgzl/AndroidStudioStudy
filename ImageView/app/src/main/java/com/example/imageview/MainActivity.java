package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        imageView=(ImageView)findViewById (R.id.imageView);
        // setbackground ile Arka plan rengi değiştime
        imageView.setBackgroundColor (Color.RED);
        //setBackgroundResource ile arka plan resmi rengi
        imageView.setBackgroundResource (R.drawable.sun);
        //ImageView  setImageBitmap ile arka plan resmi değiştirme
        Bitmap bitmap= BitmapFactory.decodeResource (getApplicationContext ().getResources (),R.drawable.sun);
        imageView.setImageBitmap (bitmap);

        imageView.setRotation (33.5f);
        //check box
        checkBox=(CheckBox)findViewById (R.id.checkBox);
        checkBox.setChecked (true);
        checkBox.setOnCheckedChangeListener (new CompoundButton.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    System.out.println ("toplam"+(5+3));
                else
                    System.out.println ("ösös");
            }
        });

    }
}