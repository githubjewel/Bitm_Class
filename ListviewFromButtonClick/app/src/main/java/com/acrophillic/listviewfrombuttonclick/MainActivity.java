package com.acrophillic.listviewfrombuttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button addButton;
    ListView listView;
    ArrayList<String>listItem;
    ArrayAdapter<String>adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= (EditText)findViewById(R.id.editText);
        addButton = (Button) findViewById(R.id.addItem);
        listView = (ListView) findViewById(R.id.listView);
        listItem = new ArrayList<String>();
        //listItem.add("First Item - added on Activity Create");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listItem);
        listView.setAdapter(adapter);
        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                listItem.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}
