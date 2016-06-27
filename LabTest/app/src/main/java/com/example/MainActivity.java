package com.example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond, etThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirst = (EditText)findViewById(R.id.textView);
        etSecond = (EditText)findViewById(R.id.textView2);
        etThird= (EditText)findViewById(R.id.textView3);
    }


    public void fullName(View view){
        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("name", etFirst.getText().toString()+etSecond.getText().toString()+etThird.getText().toString());
        startActivity(intent);
    }
}
