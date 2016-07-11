package com.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView userListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userListView = (ListView) findViewById(R.id.userListView);
        ArrayList<UserRow> users = UserRow.getAllUser();

        UserAdapter adapter = new UserAdapter(this,users);
        userListView.setAdapter(adapter);
    }
}

