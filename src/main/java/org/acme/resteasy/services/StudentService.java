package org.acme.resteasy.services;

import org.acme.resteasy.Database.dbClass;
import org.acme.resteasy.model.Student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class StudentService {

    private Map<Long, Student> students = dbClass.getStudents();

    public StudentService(){
        students.put(1L, new Student(1,"hassan",2006,"CS"));
        students.put(2L, new Student(2,"AHMED",2002,"BUS"));
        students.put(3L, new Student(3,"Amr",2003,"CS"));
        students.put(4L, new Student(4,"Youmna",2005,"ENG"));
        students.put(5L, new Student(5,"Hatem",2001,"MCM"));
    }

    public List<Student> getAllStudents(){
        return new ArrayList<Student>(students.values());
    }

    public List<Student> getAllStudentByYear(int year){
        List<Student> studByYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();

        for(Student s : students.values()){
            //cal.setTime(s.get(reated()));
            if (cal.get(Calendar.YEAR) == year){
                studByYear.add(s);
            }
        }
        return studByYear;
    }


    public List<Student> getAllStudentsPagination(int start, int size){

        ArrayList<Student> list = new ArrayList<Student>(students.values());
        if (start + size == list.size()) return new ArrayList<Student>();
        return list.subList(start,start+size);
    }

    public Student getStudent(long id){
        return students.get(id);
    }

    public Student newStudent(Student student){
        student.setId(students.size() + 1);
        students.put(student.getId(), student);
        return student;
    }

    public Student updateStudent(Student student){
        if (student.getId() <= 0){
            return null;
        }
        students.put(student.getId(),student);
        return student;
    }

    public Student deleteStudent(long id){
        return students.remove(id);
    }

}
