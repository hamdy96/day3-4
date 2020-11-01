package org.acme.resteasy.Resources;

import org.acme.resteasy.Resources.interfaces.ClasstInterface;
import org.acme.resteasy.model.Classes;
import org.acme.resteasy.services.ClassService;

import javax.ws.rs.*;
import java.util.List;


public class ClassResource implements ClasstInterface {

    ClassService cs = new ClassService();

    public List<Classes> printAllClasses(@QueryParam("year") int year,
                                         @QueryParam("start") int start,
                                         @QueryParam("size") int size) {
        if(start > 0 && size > 0){
            return cs.getAllClassesPagination(start,size);
        }
        return cs.getAllClasses();
    }

    public Classes printAll(@PathParam("id") String name) {
        return cs.getClasses(name);
    }

    public String newClass(Classes Class) {
        cs.newClass(Class);
        return "Class added successfully";
    }

    public String updateClass(String Class,Classes classes) {
        classes.setName(Class);
        cs.updateClass(classes);
        return "Class updated successfully";
    }


    public String deleteClass(String name) {
        cs.deleteClass(name);
        return "Class deleted successfully";
    }

}