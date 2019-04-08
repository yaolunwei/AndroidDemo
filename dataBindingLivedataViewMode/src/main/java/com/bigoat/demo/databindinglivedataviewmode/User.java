package com.bigoat.demo.databindinglivedataviewmode;

public class User {
    public String uid;
    public String name;
    public String phone;
    public String password;

    public User() {
        uid = "001";
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
