package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ArtistsApiService;
import io.swagger.api.factories.ArtistsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Artist;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/Artists")


@io.swagger.annotations.Api(description = "the Artists API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class ArtistsApi  {
   private final ArtistsApiService delegate = ArtistsApiServiceFactory.getArtistsApi();

    @GET
    
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Artist.class, responseContainer = "List", tags={ "Artist",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Artist.class, responseContainer = "List") })
    public Response artistsGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.artistsGet(securityContext);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Artist.class, responseContainer = "List", tags={ "Artist" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Artist.class, responseContainer = "List") })
    public Response artistsGetById(
        @ApiParam(value = "",required=true) @PathParam("id") Integer id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.artistsGetById(id,securityContext);
    }
}
