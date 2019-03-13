package io.swagger.api.factories;

import io.swagger.api.MoviesApiService;
import io.swagger.api.impl.MoviesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class MoviesApiServiceFactory {

   private final static MoviesApiService service = new MoviesApiServiceImpl();

   public static MoviesApiService getMoviesApi()
   {
      return service;
   }
}
