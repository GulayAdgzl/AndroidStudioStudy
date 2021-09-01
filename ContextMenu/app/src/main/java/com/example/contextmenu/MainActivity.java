package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edt1,edt2;

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId ()){
            case R.id.edt1:
                this.getMenuInflater ().inflate (R.menu.color,menu);
                break;
            case R.id.edt2:
                this.getMenuInflater ().inflate (R.menu.font_color,menu);
                break;
        }
        super.onCreateContextMenu (menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()){
            //Color Menusu
            case R.id.blue:
                edt1.setTextColor (Color.BLUE);
                break;
            case R.id.green:
                edt1.setTextColor (Color.GREEN);
                break;
            case R.id.red:
                edt1.setTextColor (Color.RED);
                break;

                //FontMenusu
            case R.id.f1:
                edt2.setTextSize (13);
                break;
            case R.id.f2:
                edt2.setTextSize (17);
                break;
            case R.id.f3:
                edt2.setTextSize (13);
                break;

        }
        return super.onContextItemSelected (item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        edt1=(EditText)findViewById (R.id.edt1);
        edt2=(EditText)findViewById (R.id.edt2);
        this.registerForContextMenu (edt1);
        this.registerForContextMenu (edt2);







    }
}