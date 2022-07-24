package com.example.demo.dao;

public class Question {
    private int 题号;
    private String 标签;
    private String 考点;
    private String 答案;


    public int get题号() {
        return 题号;
    }

    public void set题号(int 题号) {
        this.题号 = 题号;
    }

    public String get标签() {
        return 标签;
    }

    public void set标签(String 标签) {
        this.标签 = 标签;
    }

    public String get考点() {
        return 考点;
    }

    public void set考点(String 考点) {
        this.考点 = 考点;
    }

    public String get答案() {
        return 答案;
    }

    public void set答案(String 答案) {
        this.答案 = 答案;
    }

    @Override
    public String toString() {
        return "Question{" +
                ", 题号=" + 题号 +
                ", 标签='" + 标签 + '\'' +
                ", 考点='" + 考点 + '\'' +
                ", 答案='" + 答案 + '\'' +
                '}';
    }
}
