package com.solidprinciples;

import java.util.ArrayList;
import java.util.List;

public class Amazonapplicationexample {
    private String accountid;
    private String username;
    private String password;
    public List<String> spoppingList = new ArrayList<String>();
    public void streamVideos()
    {
        //validate user
        System.out.println("now start streaming");
    }
    public void shopping()
    {
        //validate user
        System.out.println("now start shopping");
    }
    public void listenMusic()
    {
        //validate user
        System.out.println("listening to music");
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
