package com.acrophillic.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        textView = (TextView)findViewById(R.id.textViewFaysaL);


        Intent intent = getIntent();
        String string [] = intent.getStringArrayExtra("array");
        textView.setText(string[0]+"\n"+string[1]+"\n"+string[2]);

//        Toast.makeText(this, "asdfasdf", Toast.LENGTH_LONG).show();
    }
}
