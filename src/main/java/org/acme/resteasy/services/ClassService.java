package org.acme.resteasy.services;

import org.acme.resteasy.Database.dbClass;
import org.acme.resteasy.model.Classes;
import org.acme.resteasy.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ClassService {

    private Map<String, Classes> classes = dbClass.getClasses();
    //private List<Student> studentList = new ArrayList<Student>(dbClass.getStudents().values());

    public ClassService(){
        classes.put("Physics", new Classes(1L,"Physics",new ArrayList<Student>(Arrays.asList(
                (new Student(1L,"hassan",2005,"CSC")),
                (new Student(2L,"ahmed",2006,"BUS")),
                (new Student(3L,"Heba",2008,"MCM")) ))));

        classes.put( "Math", new Classes(2L,"Math",new ArrayList<Student>(Arrays.asList(
                (new Student(4L,"Hatem",2005,"MCM")),
                (new Student(5L,"Youssef",2006,"BUS")),
                (new Student(6L,"Sara",2008,"BUS")) ))));

        classes.put("Biology", new Classes(3L,"Biology",new ArrayList<Student>(Arrays.asList(
                (new Student(7L,"hossam",2012,"CSC")),
                (new Student(8L,"mohamed",2011,"CSC")),
                (new Student(9L,"hussien",2010,"CSC")) ))));
    }

    public List<Classes> getAllClasses(){
        return new ArrayList<Classes>(classes.values());
    }

    public Classes getClasses(String name){
        return classes.get(name);
    }

    public Classes newClass(Classes Class){
        Class.setId(classes.size() + 1);
        classes.put(Class.getName(), Class);
        return Class;
    }

    public List<Classes> getAllClassesPagination(int start, int size){

        ArrayList<Classes> list = new ArrayList<Classes>(classes.values());
        if (start + size == list.size()) return new ArrayList<Classes>();
        return list.subList(start,start+size);
    }

    public Classes updateClass(Classes Classes){
        if (Classes.getName().isEmpty()){
            return null;
        }
        classes.put(Classes.getName(),Classes);
        return Classes;
    }

    public Classes deleteClass(String name){
        return classes.remove(name);
    }

}
