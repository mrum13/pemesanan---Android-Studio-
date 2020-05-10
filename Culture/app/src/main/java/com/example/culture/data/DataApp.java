package com.example.culture;

public class DataApp {
    private  int img;
    private String desc;

    public DataApp(int img, String desc) {
        this.img = img;
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
