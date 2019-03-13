package io.swagger.api.factories;

import io.swagger.api.ArtistsApiService;
import io.swagger.api.impl.ArtistsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class ArtistsApiServiceFactory {

   private final static ArtistsApiService service = new ArtistsApiServiceImpl();

   public static ArtistsApiService getArtistsApi()
   {
      return service;
   }
}
