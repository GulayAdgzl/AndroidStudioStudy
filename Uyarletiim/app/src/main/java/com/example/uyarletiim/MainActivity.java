package com.example.uyarletiim;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    }
    public void open(View view){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder (this);
        alertDialogBuilder.setMessage ("Are you sure," +
                "You wanted to make decision");
        alertDialogBuilder.setPositiveButton ("yes", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText (MainActivity.this,"You clicked yed button",Toast.LENGTH_LONG).show ();
            }
        });

        alertDialogBuilder.setNegativeButton ("No", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish ();
            }
        });
        AlertDialog alertDiaolog=alertDialogBuilder.create ();
        alertDiaolog.show ();


    }











}