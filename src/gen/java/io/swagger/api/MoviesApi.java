package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MoviesApiService;
import io.swagger.api.factories.MoviesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Movie;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/Movies")


@io.swagger.annotations.Api(description = "the Movies API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class MoviesApi  {
   private final MoviesApiService delegate = MoviesApiServiceFactory.getMoviesApi();

    @GET
    
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Movie.class, responseContainer = "List", tags={ "Movie",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Movie.class, responseContainer = "List") })
    public Response moviesGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moviesGet(securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Movie.class, responseContainer = "List", tags={ "Movie" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Movie.class, responseContainer = "List") })
    public Response moviesGetById(
        @ApiParam(value = "",required=true) @PathParam("id") Integer id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.moviesGetById(id,securityContext);
    }
}
