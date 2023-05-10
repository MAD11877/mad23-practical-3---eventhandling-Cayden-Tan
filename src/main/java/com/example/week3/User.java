package com.example.week3;

import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {

    String Name;
    String Description;
    int ID;
    boolean Followed;

    public User(String name, String description, int id, boolean followed)
    {
        Name = name;
        Description = description;
        ID = id;
        Followed = followed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isFollowed() {
        return Followed;
    }

    public void setFollowed(boolean followed) {
        Followed = followed;
    }


}