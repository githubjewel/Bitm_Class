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
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        sharedPreferences = getSharedPreferences("Batch-16", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void Save(View view) {

        String saveData = editText.getText().toString().trim();
        editor.putString("message", saveData);
        editor.commit();
    }

    public void Retrive(View view) {

        String showData = sharedPreferences.getString("message","Data Not Found...");
        textView.setText(showData);
    }
}
