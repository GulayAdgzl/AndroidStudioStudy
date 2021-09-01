package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mList;
    private String [] meyveler={"Muz","Kiraz","Elma","Çilek"};
    private int [] Kaloriler={25,20,15,30};
    private int[]resimler={R.drawable.cilek,R.drawable.elma,R.drawable.kiraz,R.drawable.muz};

    private MeyveAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mList=(ListView)findViewById (R.id.listview1);
        adapter=new MeyveAdapter (meyveler,Kaloriler,resimler,this);
        mList.setAdapter (adapter);

        mList.setOnItemClickListener (new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (getApplicationContext (),meyveler[position],Toast.LENGTH_SHORT).show ();

            }
        });


    }
}