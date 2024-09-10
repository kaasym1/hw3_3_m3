package com.example.hw3_3_m3;

public class Country {
    private String name;
    private String flag;
    private String desc;


    public Country(String name, String logo, String desc) {
        this.name = name;
        this.flag = flag;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return flag;
    }

    public void setLogo(String logo) {
        this.flag = flag;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
