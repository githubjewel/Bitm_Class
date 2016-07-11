package com.example;

import java.util.ArrayList;

public class UserRow {

    private int imageID;
    private String name;
    private String phone;
    private String email;


    public UserRow(int imageID, String name, String phone, String email) {
        this.imageID = imageID;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public UserRow() {
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ArrayList<UserRow> getAllUser(){

        ArrayList<UserRow> users = new ArrayList<>();
        users.add(new UserRow(R.drawable.user1,"User-1","+88018816530","user1@gmail.com"));
        users.add(new UserRow(R.drawable.user2,"User-2","+88018816531","user2@gmail.com"));
        users.add(new UserRow(R.drawable.user3,"User-3","+88018816532","user3@gmail.com"));

        return users;
    }

}
