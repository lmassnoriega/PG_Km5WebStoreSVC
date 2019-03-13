package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class Movie   {
  
  private Integer ID = null;
  private String title = null;
  private String year = null;
  private String rated = null;
  private String released = null;
  private String runtime = null;
  private String genre = null;
  private String director = null;
  private String writer = null;
  private String actors = null;
  private String plot = null;
  private String language = null;
  private String country = null;
  private String awards = null;
  private String poster = null;
  private String imdbRating = null;

  public Movie(Integer id, String title, String year, String rated, String released, String runtime, String genre, String director, String writer, String actors, String plot, String language, String country, String awards, String poster, String imdbRating){
    this.ID = id;
    this.title = title;
    this.year = year;
    this.rated = rated;
    this.released = released;
    this.runtime = runtime;
    this.genre = genre;
    this.director = director;
    this.writer = writer;
    this.actors = actors;
    this.plot = plot;
    this.language = language;
    this.country = country;
    this.awards = awards;
    this.poster = poster;
    this.imdbRating = imdbRating;
  }
  
  /**
   **/
  public Movie ID(Integer ID) {
    this.ID = ID;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("ID")
  public Integer getID() {
    return ID;
  }
  public void setID(Integer ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public Movie title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public Movie year(String year) {
    this.year = year;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Year")
  public String getYear() {
    return year;
  }
  public void setYear(String year) {
    this.year = year;
  }

  
  /**
   **/
  public Movie rated(String rated) {
    this.rated = rated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Rated")
  public String getRated() {
    return rated;
  }
  public void setRated(String rated) {
    this.rated = rated;
  }

  
  /**
   **/
  public Movie released(String released) {
    this.released = released;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Released")
  public String getReleased() {
    return released;
  }
  public void setReleased(String released) {
    this.released = released;
  }

  
  /**
   **/
  public Movie runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Runtime")
  public String getRuntime() {
    return runtime;
  }
  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  
  /**
   **/
  public Movie genre(String genre) {
    this.genre = genre;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Genre")
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }

  
  /**
   **/
  public Movie director(String director) {
    this.director = director;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Director")
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }

  
  /**
   **/
  public Movie writer(String writer) {
    this.writer = writer;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Writer")
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }

  
  /**
   **/
  public Movie actors(String actors) {
    this.actors = actors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Actors")
  public String getActors() {
    return actors;
  }
  public void setActors(String actors) {
    this.actors = actors;
  }

  
  /**
   **/
  public Movie plot(String plot) {
    this.plot = plot;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Plot")
  public String getPlot() {
    return plot;
  }
  public void setPlot(String plot) {
    this.plot = plot;
  }

  
  /**
   **/
  public Movie language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   **/
  public Movie country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   **/
  public Movie awards(String awards) {
    this.awards = awards;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Awards")
  public String getAwards() {
    return awards;
  }
  public void setAwards(String awards) {
    this.awards = awards;
  }

  
  /**
   **/
  public Movie poster(String poster) {
    this.poster = poster;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Poster")
  public String getPoster() {
    return poster;
  }
  public void setPoster(String poster) {
    this.poster = poster;
  }

  
  /**
   **/
  public Movie imdbRating(String imdbRating) {
    this.imdbRating = imdbRating;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("imdbRating")
  public String getImdbRating() {
    return imdbRating;
  }
  public void setImdbRating(String imdbRating) {
    this.imdbRating = imdbRating;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(ID, movie.ID) &&
        Objects.equals(title, movie.title) &&
        Objects.equals(year, movie.year) &&
        Objects.equals(rated, movie.rated) &&
        Objects.equals(released, movie.released) &&
        Objects.equals(runtime, movie.runtime) &&
        Objects.equals(genre, movie.genre) &&
        Objects.equals(director, movie.director) &&
        Objects.equals(writer, movie.writer) &&
        Objects.equals(actors, movie.actors) &&
        Objects.equals(plot, movie.plot) &&
        Objects.equals(language, movie.language) &&
        Objects.equals(country, movie.country) &&
        Objects.equals(awards, movie.awards) &&
        Objects.equals(poster, movie.poster) &&
        Objects.equals(imdbRating, movie.imdbRating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, title, year, rated, released, runtime, genre, director, writer, actors, plot, language, country, awards, poster, imdbRating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    rated: ").append(toIndentedString(rated)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    director: ").append(toIndentedString(director)).append("\n");
    sb.append("    writer: ").append(toIndentedString(writer)).append("\n");
    sb.append("    actors: ").append(toIndentedString(actors)).append("\n");
    sb.append("    plot: ").append(toIndentedString(plot)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    awards: ").append(toIndentedString(awards)).append("\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    imdbRating: ").append(toIndentedString(imdbRating)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

