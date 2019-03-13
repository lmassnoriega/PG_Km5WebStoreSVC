package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AlbumsartistIdidApiService;
import io.swagger.api.factories.AlbumsartistIdidApiServiceFactory;

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

@Path("/Albums&artistId={id}")


@io.swagger.annotations.Api(description = "the Albums?artistId={id} API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class AlbumsartistIdidApi  {
   private final AlbumsartistIdidApiService delegate = AlbumsartistIdidApiServiceFactory.getAlbumsartistIdidApi();

    @GET    
    @Produces({ "application/json", "text/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Album.class, responseContainer = "List", tags={ "Album", "Artist" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Album.class, responseContainer = "List") })
    public Response albumsGetByArtistId(
        @ApiParam(value = "",required=true) @PathParam("id") Integer id,
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.albumsGetByArtistId(id,securityContext);
    }
}
