package com.acrophillic.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {

    TextView nameText;
    TextView ageText;
    TextView districtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);


        String name = getIntent().getStringExtra("name");
        String age = getIntent().getStringExtra("age");
        String district = getIntent().getStringExtra("district");

         nameText = (TextView) findViewById(R.id.name);
         ageText = (TextView) findViewById(R.id.age);
         districtText = (TextView) findViewById(R.id.district);

         nameText.setText(name);
         ageText.setText(age);
         districtText.setText(district);
    }
}
