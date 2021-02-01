package com.example.blogapp.Models;

import com.google.android.gms.tasks.Task;

public class Comment {
    private int id;
    private String comment;
    private String date;

    private String fbtoken;
    private User user;

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFBToken() {
        return fbtoken;
    }

    public void setFBToken(String token) {
        this.fbtoken = token;
    }
}
