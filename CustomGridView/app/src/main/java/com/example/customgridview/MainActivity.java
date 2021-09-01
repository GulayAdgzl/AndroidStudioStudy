package com.example.customgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView mgrid;
    private String[] hayvalar={"kedi","köpek","ördek"};
   private HayvanAdapter adapter;
    private int[] resimler={R.drawable.kedi,R.drawable.kopek,R.drawable.ordek};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mgrid=(GridView)findViewById (R.id.grid1);
        adapter=new HayvanAdapter (hayvalar,resimler,this);
        mgrid.setAdapter (adapter);

        mgrid.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (getApplicationContext (),hayvalar[position],Toast.LENGTH_SHORT).show ();
            }
        });
    }
}