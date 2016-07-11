package com.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mylist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist = (ListView) findViewById(R.id.teamListView);

        ArrayList<Team> teams = Team.getAllTeam();

        TeamAdapter teamAdapter = new TeamAdapter(this,teams);
        mylist.setAdapter(teamAdapter);
    }
}
