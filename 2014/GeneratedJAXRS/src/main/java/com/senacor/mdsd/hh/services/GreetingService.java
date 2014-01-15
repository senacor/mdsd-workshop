package com.senacor.mdsd.hh.services;

import com.senacor.mdsd.hh.entities.Greeting;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class GreetingService {
    @GET
    @Path("/{name}")
    @Produces({MediaType.APPLICATION_JSON})
    public Greeting getGreeting(@PathParam("name") String name) {

        Greeting greeting = new Greeting("hello", name);

        String output = "Hello, "+name+"!";

        if ("unbekannt".equalsIgnoreCase(name)) {
            throw new WebApplicationException(Response.status(Response.Status.NOT_FOUND).entity("person not found: " + name).build());
        }

        // return Response.status(200).entity(output).build();
        return greeting;
    }

    @PUT
    @Path("/")
    @Consumes
    // curl -X PUT -d"{'greeting':{'greeting':'hello','name':'ralph'}}" localhost:8080/mdsd/greeting -v -H "Content-type: application/json"
    public Response saveGreeting(Greeting greeting) {
        return Response.status(201).entity(greeting).build();
    }
}
