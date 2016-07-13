package com.acrophillic.sharedpreferencesdemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    SharedPreference obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        obj = new SharedPreference(this);
    }

    public void Save(View view) {

        obj.saveData(editText.getText().toString().trim());
    }

    public void Retrive(View view) {

        textView.setText(obj.getData());
    }
}
