package com.acrophillic.intenttutorail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond, etThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = (EditText) findViewById(R.id.textView);
        etSecond = (EditText) findViewById(R.id.textView2);
        etThird = (EditText) findViewById(R.id.textView3);
    }


    public void fullName(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String st = etFirst.getText().toString() +" "+ etSecond.getText().toString() +" "+ etThird.getText().toString();

        intent.putExtra("phone", etFirst.getText().toString());
        intent.putExtra("email", etSecond.getText().toString());
        intent.putExtra("url", etThird.getText().toString());
        startActivity(intent);
        Log.d("fahim", "faysal...................." + st);
    }
}
