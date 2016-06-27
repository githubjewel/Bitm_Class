package com.acrophillic.intenttutorail;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Mobile App Develop on 16-6-16.
 */
public class SecondActivity extends AppCompatActivity {

TextView tvPhone, tvEmail, tvUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

tv = (TextView) findViewById(R.id.p);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        tv.setText(name);

    }
}
