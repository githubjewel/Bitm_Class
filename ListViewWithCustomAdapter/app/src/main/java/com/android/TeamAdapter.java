package com.android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TeamAdapter extends ArrayAdapter<Team> {

    private Context context;
    ArrayList<Team> teams;

    public TeamAdapter(Context context,ArrayList<Team> teams) {
        super(context,R.layout.team_row, teams);
        this.context = context;
        this.teams = teams;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.team_row,parent,false);
        TextView txt = (TextView) convertView.findViewById(R.id.teamName);
        ImageView image = (ImageView) convertView.findViewById(R.id.teamImage);

        txt.setText(teams.get(position).getTeamName());
        image.setImageResource(teams.get(position).getImageID());


        return convertView;
    }
}
