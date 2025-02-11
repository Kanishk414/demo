package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int rono;
    private String name ;

    public int getrono() {
        return rono;
    }

    public void setRono(int rono) {
        this.rono = rono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int rono, String name) {
        this.rono = rono;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rono=" + rono +
                ", name='" + name + '\'' +
                '}';
    }
}
