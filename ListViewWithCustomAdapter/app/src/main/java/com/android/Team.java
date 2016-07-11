package com.android;

import java.util.ArrayList;

public class Team {

    private String teamName;
    private int imageID;

    public Team(String teamName, int imageID) {
        this.teamName = teamName;
        this.imageID = imageID;
    }

    public Team() {
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Team> getAllTeam(){

        ArrayList<Team>teams = new ArrayList<>();
        teams.add(new Team("Angry Bird",R.drawable.angrybird));
        teams.add(new Team("Minions",R.drawable.minions));

        return teams;
    }
}
