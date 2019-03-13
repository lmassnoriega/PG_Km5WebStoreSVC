package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AlbumsApiService;
import io.swagger.api.factories.AlbumsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Album;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/Albums")


@io.swagger.annotations.Api(description = "the Albums API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class AlbumsApi  {
   private final AlbumsApiService delegate = AlbumsApiServiceFactory.getAlbumsApi();

    @GET
    
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Album.class, responseContainer = "List", tags={ "Album",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Album.class, responseContainer = "List") })
    public Response albumsGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.albumsGet(securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Album.class, responseContainer = "List", tags={ "Album" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Album.class, responseContainer = "List") })
    public Response albumsGetById(
        @ApiParam(value = "",required=true) @PathParam("id") Integer id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.albumsGetById(id,securityContext);
    }
}
