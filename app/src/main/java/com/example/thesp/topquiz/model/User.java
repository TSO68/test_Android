package com.example.thesp.topquiz.model;

public class User {
    private String mFirstname;

    public String getFirstName() {
        return mFirstname;
    }

    public void setFirstName(String firstname) {
        mFirstname = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
}
