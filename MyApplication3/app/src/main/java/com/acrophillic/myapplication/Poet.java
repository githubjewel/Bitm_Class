package com.acrophillic.myapplication;

/**
 * Created by Mobile App Develop on 23-6-16.
 */
public class Poet {

    private String name;
    private String description;

    public Poet(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

}
