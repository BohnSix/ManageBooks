package com.bohnsix.managebooks.pojo;

import  lombok.Data;

@Data
public class User {
    private int userID;
    private  String userName;
    private  String password;
    private  String rname;
    private  String phone;
    private  String email;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {}
}
