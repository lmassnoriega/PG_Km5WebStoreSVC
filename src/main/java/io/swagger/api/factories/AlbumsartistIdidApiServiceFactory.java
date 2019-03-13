package io.swagger.api.factories;

import io.swagger.api.AlbumsartistIdidApiService;
import io.swagger.api.impl.AlbumsartistIdidApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class AlbumsartistIdidApiServiceFactory {

   private final static AlbumsartistIdidApiService service = new AlbumsartistIdidApiServiceImpl();

   public static AlbumsartistIdidApiService getAlbumsartistIdidApi()
   {
      return service;
   }
}
