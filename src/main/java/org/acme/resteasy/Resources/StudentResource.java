package org.acme.resteasy.Resources;

import org.acme.resteasy.Resources.interfaces.StudentInterface;
import org.acme.resteasy.model.Classes;
import org.acme.resteasy.model.Student;
import org.acme.resteasy.services.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
public class StudentResource implements StudentInterface{

    StudentService ss = new StudentService();

    public List<Student> printAll(@QueryParam("year") int year,
                                  @QueryParam("start") int start,
                                  @QueryParam("size") int size){
        if (year > 0){
            return ss.getAllStudentByYear(year);
        }
        if(start > 0 && size > 0){
            return ss.getAllStudentsPagination(start,size);
        }
        return ss.getAllStudents();
    }

    public String getStudent(@PathParam("id") long id){
        return ss.getStudent(id).getName();
    }

    public String newStudent(Student student){
        ss.newStudent(student);
        return "Student added successfully";
    }

    public String updateStudent(Student student){
        ss.updateStudent(student);
        return "Student updated successfully";
    }

    public String deleteStudent(@PathParam("id") long id){
         ss.deleteStudent(id);
        return "Student deleted successfully";
    }

}