package com.acrophillic.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Activity2.class);

        Bundle bundle = new Bundle();
        bundle.putString("first", et1.getText().toString());
        bundle.putString("second", et2.getText().toString());
        bundle.putString("third", et3.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);

    }

    public void onClick2(View view) {

        String string[] = {et1.getText().toString(),et2.getText().toString(),et3.getText().toString() };
        Intent intent = new Intent(this, Activity3.class);
        intent.putExtra("array", string);
        startActivity(intent);
    }
}
