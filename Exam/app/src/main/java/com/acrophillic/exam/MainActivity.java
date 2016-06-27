package com.acrophillic.exam;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnCalculate;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textViewTotal);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new TimePickerFragment();
                newFragment.show(getSupportFragmentManager(), "timePicker");
                String st  =TimePickerFragment.st;

                /*TimePickerFragment timePickerFragment = new TimePickerFragment();
               String st =  timePickerFragment.getData();*/
                Log.d("finally ", st);

            }
        });

    }


}
