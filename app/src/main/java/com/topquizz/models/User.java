package com.topquizz.models;

public class User {
    private String mName;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
