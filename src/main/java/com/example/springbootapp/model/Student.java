package com.example.springbootapp.model;

import java.io.Serializable;

public class Student implements Serializable {

    private static final String serialVersionUID = "7285051614499637595";

    private String id;
    private String name;
    private String city;

    public Student() {
    }

    public Student(String id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", city='" + city + '\'' +
               '}';
    }
}