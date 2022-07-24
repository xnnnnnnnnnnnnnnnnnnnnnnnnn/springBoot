package com.example.demo.dao;

public class ModifyQuestion {
    private int 题号;
    private String 用户名;

    public int get题号() {
        return 题号;
    }

    public void set题号(int 题号) {
        this.题号 = 题号;
    }

    public String get用户名() {
        return 用户名;
    }

    public void set用户名(String 用户名) {
        this.用户名 = 用户名;
    }

    @Override
    public String toString() {
        return "ModifyQuestion{" +
                "题号=" + 题号 +
                ", 用户名='" + 用户名 + '\'' +
                '}';
    }
}
