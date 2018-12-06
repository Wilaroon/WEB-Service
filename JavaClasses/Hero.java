package com.example.wilar.web_service;

public class Hero {

    private String name;
    private String realname;
    private String team;

    public Hero(String name, String realname, String team) {
        this.name = name;
        this.realname = realname;
        this.team = team;
    }
    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }



}
