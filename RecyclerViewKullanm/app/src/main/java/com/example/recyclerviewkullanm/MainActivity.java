package com.example.recyclerviewkullanm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRec;
    private MeyvelerAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        mRec=(RecyclerView)findViewById (R.id.reyclerview);
        adapter=new MeyvelerAdapter (Meyveler.getData (),this);


        mRec.setHasFixedSize (true);
        LinearLayoutManager manager=new LinearLayoutManager (this,LinearLayoutManager.VERTICAL,false);
        mRec.setLayoutManager (manager);
        mRec.setAdapter (adapter);

        adapter.setOnClickListener (new MeyvelerAdapter.OnItemClickListener () {
            @Override
            public void onItemClick(Meyveler meyveler, int position) {
                Toast.makeText (getApplicationContext (),meyveler.getMeyveIsmi (),Toast.LENGTH_SHORT).show ();
            }
        });

    }
}