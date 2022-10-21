package com.example.madgroupproject;

public class User {

    public String username,email,phoneNo,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(){

    }

    public User(String username, String email, String phoneNo, String password) {
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
    }


}
