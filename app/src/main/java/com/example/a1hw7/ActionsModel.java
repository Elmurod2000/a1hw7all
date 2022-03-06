package com.example.a1hw7;

public class ActionsModel {
    private int photo;
    private String action;
    private int photo2;

    public ActionsModel(int photo, String action, int photo2) {
        this.photo = photo;
        this.action = action;
        this.photo2 = photo2;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getPhoto2() {
        return photo2;
    }

    public void setPhoto2(int photo2) {
        this.photo2 = photo2;
    }
}
