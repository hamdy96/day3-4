package org.acme.resteasy.Database;

import org.acme.resteasy.model.*;

import java.util.HashMap;
import java.util.Map;

public class dbClass {

    private static Map<Long, Student> students = new HashMap<>();
    private static Map<String, Classes> classes = new HashMap<>();

    public static Map<Long, Student> getStudents(){
        return students;
    }

    public static Map<String, Classes> getClasses(){
        return classes;
    }
}
