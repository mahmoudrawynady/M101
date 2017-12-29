package com.example.kashasha.m101;

/**
 * Created by PH-Data™ 01221240053 on 06/12/2017.
 */

public class DataModel {

    public String title;
    public int icon;


    // Constructor.
    public DataModel( String title,int icon) {

        this.title = title;
        this.icon=icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }
}