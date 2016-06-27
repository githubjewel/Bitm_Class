package com.acrophillic.myapplicationandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView sampleListView;
    ArrayList<String>name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sampleListView=(ListView)findViewById(R.id.nameList);
        name=new ArrayList<>();
        name.add("amirul");
        name.add("rahim");
        name.add("karim");
        ArrayAdapter<String>StringArrayAdapter<new ArrayAdapter<>(this,android.R.layout.simple);
        sampleListView.setAdapter(StringArrayAdapter);

    }

}
