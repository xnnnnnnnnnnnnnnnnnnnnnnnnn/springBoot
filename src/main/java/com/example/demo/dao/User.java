package com.example.demo.dao;

public class User {
    private String 用户名;
    private String 密码;
    private String 模式;
    private String 邮箱;
    private String 性别;

    public String get用户名() {
        return 用户名;
    }

    public void set用户名(String 用户名) {
        this.用户名 = 用户名;
    }

    public String get密码() {
        return 密码;
    }

    public void set密码(String 密码) {
        this.密码 = 密码;
    }

    public String get模式() {
        return 模式;
    }

    public void set模式(String 模式) {
        this.模式 = 模式;
    }

    public String get邮箱() {
        return 邮箱;
    }

    public void set邮箱(String 邮箱) {
        this.邮箱 = 邮箱;
    }

    public String get性别() {
        return 性别;
    }

    public void set性别(String 性别) {
        this.性别 = 性别;
    }

    @Override
    public String toString() {
        return "User{" +
                "用户名='" + 用户名 + '\'' +
                ", 密码='" + 密码 + '\'' +
                ", 模式='" + 模式 + '\'' +
                ", 邮箱='" + 邮箱 + '\'' +
                ", 性别='" + 性别 + '\'' +
                '}';
    }
}
