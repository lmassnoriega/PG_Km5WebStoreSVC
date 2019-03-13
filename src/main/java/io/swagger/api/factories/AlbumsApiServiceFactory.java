package io.swagger.api.factories;

import io.swagger.api.AlbumsApiService;
import io.swagger.api.impl.AlbumsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class AlbumsApiServiceFactory {

   private final static AlbumsApiService service = new AlbumsApiServiceImpl();

   public static AlbumsApiService getAlbumsApi()
   {
      return service;
   }
}
