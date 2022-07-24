package com.example.demo.dao;

public class QuestionTitle {
    private int 题号;
    private String 考点;


    public int get题号() {
        return 题号;
    }

    public void set题号(int 题号) {
        this.题号 = 题号;
    }


    public String get考点() {
        return 考点;
    }

    public void set考点(String 考点) {
        this.考点 = 考点;
    }


    @Override
    public String toString() {
        return "Question{" +
                ", 题号=" + 题号 +
                ", 考点='" + 考点 + '\'' +
                '}';
    }
}
