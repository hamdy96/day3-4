package org.acme.resteasy.Resources.interfaces;

import org.acme.resteasy.model.Classes;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/classes")
public interface ClasstInterface {

    @GET
    public List<Classes> printAllClasses(@QueryParam("year") int year,
                                         @QueryParam("start") int start,
                                         @QueryParam("size") int size);

    @GET
    @Path("/{class}")
    public Classes printAll(@PathParam("class") String name);

    @POST
    public String newClass(Classes classes);

    @PUT
    @Path("/{class}")
    public String updateClass(@PathParam("class") String Class,Classes classes);

    @DELETE
    @Path("/{class}")
    public String deleteClass(@PathParam("class") String name);
}