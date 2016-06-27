package com.acrophillic.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);

        final ArrayList<String>list = new ArrayList<>();

        list.add("Kazi Nazrul Islam");
        list.add("Rabindonath Thakur");
        list.add("Baqee Billah");

//        ArrayAdapter<String>arrayAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        ArrayAdapter<String>arrayAdapter =  new ArrayAdapter<String>(this, R.layout.row,R.id.textView, list);
        //only one view can change

        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//              Toast.makeText(getApplicationContext(), list.get(i), Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(), adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_LONG).show();


           /*     Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle bundle = new Bundle();
                if(i == 0){
                    bundle.putString("name", "Kazi Nazrul Islam");
                    bundle.putString("Description", "Kazi Nazrul Islam");
                }else if(i == 0) {
                    bundle.putString("name", "Kazi Nazrul Islam");
                    bundle.putString("Description", "Kazi Nazrul Islam");
                }else if(i == 0) {
                    bundle.putString("name", "Kazi Nazrul Islam");
                    bundle.putString("Description", "Kazi Nazrul Islam");
                }*/


                }
        });
    }
}
