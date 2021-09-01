package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView mgrid;
    private String [] sayilar={"1","2","3","4","5","6","7","8","9","10"};

    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mgrid=(GridView)findViewById (R.id.grid);
        adapter=new ArrayAdapter (this, android.R.layout.simple_list_item_1,sayilar);
        mgrid.setAdapter (adapter);
        mgrid.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (getApplicationContext (),sayilar[position],Toast.LENGTH_SHORT).show ();

            }
        });

    }
}