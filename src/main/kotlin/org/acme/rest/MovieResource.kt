package org.acme.rest

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/movie")
@Produces(MediaType.APPLICATION_JSON)
class MovieResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun hello() = Movie("Star Wars", 2019)
}