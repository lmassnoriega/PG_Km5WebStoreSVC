package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class Album   {
  
  private Integer ID = null;
  private String name = null;
  private Integer artist = null;
  private String url = null;
  private String image = null;
  private String listeners = null;
  private String playcount = null;


  public Album(Integer id, Integer artist, String name, String url, String image, String listeners, String playcount){
    this.ID=id;
    this.name = name;
    this.artist= artist;
    this.url=url;
    this.image = image;
    this.listeners=listeners;
    this.playcount=playcount;
  }
  
  /**
   **/
  public Album ID(Integer ID) {
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
  public Album name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Album artist(Integer artist) {
    this.artist = artist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Artist")
  public Integer getArtist() {
    return artist;
  }
  public void setArtist(Integer artist) {
    this.artist = artist;
  }

  
  /**
   **/
  public Album url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public Album image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   **/
  public Album listeners(String listeners) {
    this.listeners = listeners;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Listeners")
  public String getListeners() {
    return listeners;
  }
  public void setListeners(String listeners) {
    this.listeners = listeners;
  }

  
  /**
   **/
  public Album playcount(String playcount) {
    this.playcount = playcount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("Playcount")
  public String getPlaycount() {
    return playcount;
  }
  public void setPlaycount(String playcount) {
    this.playcount = playcount;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Album album = (Album) o;
    return Objects.equals(ID, album.ID) &&
        Objects.equals(name, album.name) &&
        Objects.equals(artist, album.artist) &&
        Objects.equals(url, album.url) &&
        Objects.equals(image, album.image) &&
        Objects.equals(listeners, album.listeners) &&
        Objects.equals(playcount, album.playcount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, artist, url, image, listeners, playcount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Album {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
    sb.append("    playcount: ").append(toIndentedString(playcount)).append("\n");
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

