package org.acme.resteasy.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Student {


    private long id;
    private String name;
    private int year;
    private String major;

    public Student(long id, String name,int year,String major){
        this.id = id;
        this.name = name;
        this.year = year;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public long getId() {
        return id;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(long id) {
        this.id = id;
    }
}
