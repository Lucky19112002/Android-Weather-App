package com.example.weatherapp.Domains;

public class Hourly {
    private  String hour;
    private  String picPath;
    private  int temp;

    public Hourly(String hour, String picPath, int temp) {
        this.hour = hour;
        this.picPath = picPath;
        this.temp = temp;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
