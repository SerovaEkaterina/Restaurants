package com.example.lenovo.app.model;

public class Item {
    String resName;
    int resPhoto;
    String resPlace;
    String resAbout;


    public Item(String resName, int resPhoto, String resPlace, String resAbout) {
        this.resName = resName;
        this.resPhoto = resPhoto;
        this.resPlace = resPlace;
        this.resAbout = resAbout;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public int getResPhoto() {
        return resPhoto;
    }

    public void setResPhoto(int resPhoto) {
        this.resPhoto = resPhoto;
    }

    public String getResPlace() {
        return resPlace;
    }

    public void setResPlace(String resPlace) {
        this.resPlace = resPlace;
    }

    public String getResAbout() {
        return resAbout;
    }

    public void setResAbout(String resAbout) {
        this.resAbout = resAbout;
    }
}

