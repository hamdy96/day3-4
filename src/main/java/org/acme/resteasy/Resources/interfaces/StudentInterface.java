package org.acme.resteasy.Resources.interfaces;

import org.acme.resteasy.model.Classes;
import org.acme.resteasy.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebEndpoint;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/students")
public interface StudentInterface {

    @GET
    public List<Student> printAll(@QueryParam("year") int year,
                                  @QueryParam("start") int start,
                                  @QueryParam("size") int size);

    @GET
    @Path("/{id}")
    public String getStudent(@PathParam("id") long id);

    @POST
    public String newStudent(Student student);

    @PUT
    public String updateStudent(Student student);

    @DELETE
    @Path("/{id}")
    public String deleteStudent(@PathParam("id") long id);

}