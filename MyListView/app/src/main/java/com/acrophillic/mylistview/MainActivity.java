package com.acrophillic.mylistview;

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

        final ArrayList<String> names = new ArrayList<>();

        names.add("Forhad");
        names.add("Fahim");
        names.add("koushik");
        names.add("Tushin");

        sampleListView= (ListView) findViewById(R.id.nameListView);
        ArrayAdapter mAdapter =new ArrayAdapter(this,R.layout.myowndesign, R.id.nameTextView,names);
        sampleListView.setAdapter(mAdapter);

        sampleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this,names.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
