package com.acrophillic.mylistview;

public class Poet {

    private String poetName;
    private String poetAge;
    private String poetDistrict;

    public Poet(String poetName, String poetAge, String poetDistrict) {
        this.poetName = poetName;
        this.poetAge = poetAge;
        this.poetDistrict = poetDistrict;
    }

    @Override
    public String toString() {

        return poetName;
    }

    public String getPoetDistrict() {
        return poetDistrict;
    }

    public void setPoetDistrict(String poetDistrict) {
        this.poetDistrict = poetDistrict;
    }

    public String getPoetAge() {
        return poetAge;
    }

    public void setPoetAge(String poetAge) {
        this.poetAge = poetAge;
    }

    public String getPoetName() {

        return poetName;
    }

    public void setPoetName(String poetName) {
        this.poetName = poetName;
    }
}
