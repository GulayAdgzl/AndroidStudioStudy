package com.example.meneklemek;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate (R.menu.menu_item, menu);
        return super.onCreateOptionsMenu (menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.home:
                Toast.makeText (getApplicationContext (), "Home", Toast.LENGTH_SHORT).show ();
                break;
            case R.id.search:
                Toast.makeText (getApplicationContext (), "Search", Toast.LENGTH_SHORT).show ();
                break;
            case R.id.profile:
                Toast.makeText (getApplicationContext (), "Profile", Toast.LENGTH_SHORT).show ();
                break;

        }

        return super.onOptionsItemSelected (item);

    }



        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate (savedInstanceState);
            setContentView (R.layout.activity_main);
        }





}