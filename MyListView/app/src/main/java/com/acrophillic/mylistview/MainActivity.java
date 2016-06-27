package com.acrophillic.mylistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView sampleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleListView= (ListView) findViewById(R.id.nameListView);

        final ArrayList<Poet> poets = new ArrayList<>();
        poets.add(new Poet("Jasim Uddin","60","Faridpur"));
        poets.add(new Poet("Rabindranath Thakur","70","Calcutta"));
        poets.add(new Poet("Jibanananda Das","50","Barisal"));

        ArrayAdapter<Poet> myadapter = new ArrayAdapter<Poet>(this,android.R.layout.simple_list_item_1,poets);
        sampleListView.setAdapter(myadapter);

        sampleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Toast.makeText(MainActivity.this, poets.get(i).getPoetName(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,Description.class);

                intent.putExtra("name", poets.get(i).getPoetName());
                intent.putExtra("age", poets.get(i).getPoetAge());
                intent.putExtra("district", poets.get(i).getPoetDistrict());
                startActivity(intent);
            }
        });


    }
}
