package com.acrophillic.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ListView mylistview;
    ArrayList<String> names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mylistview = (ListView) findViewById(R.id.mylistView);
        names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);
        mylistview.setAdapter(myadapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    public void menu1(MenuItem item) {

        Toast.makeText(MainActivity.this, "Menu 1 is selected", Toast.LENGTH_SHORT).show();
    }

    public void menu2(MenuItem item) {
        Toast.makeText(MainActivity.this, "Menu 2 is selected", Toast.LENGTH_SHORT).show();
    }


}
