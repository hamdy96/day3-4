package org.acme.resteasy.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

@JsonSerialize
public class Classes {


    private long id;
    private String name;
    private List<Student> student;

    public Classes(long id, String name, List<Student> student){
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
