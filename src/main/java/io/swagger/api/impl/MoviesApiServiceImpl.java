package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Movie;

import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class MoviesApiServiceImpl extends MoviesApiService {
    
    private ArrayList<Movie> loadMovies()
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        //TODO
        list.add(new Movie(0, "The Fifth Element","1977", "PG-13", 
        "09 May 1997", "126 min", "Action, Adventure, Sci-Fi", 
        "Luc Besson", "Luc Besson (story), Luc Besson (screenplay), Robert Mark Kamen (screenplay)", 
        "Bruce Willis, Gary Oldman, Ian Holm, Milla Jovovich", 
        "In the twenty-third century, the universe is threatened by evil. The only hope for mankind is the Fifth Element, who comes to Earth every five thousand years to protect the humans with four stones of the four elements: fire, water, Earth and air. A Mondoshawan spacecraft is bringing The Fifth Element back to Earth but it is destroyed by the evil Mangalores. However, a team of scientists use the DNA of the remains of the Fifth Element to rebuild the perfect being called Leeloo. She escapes from the laboratory and stumbles upon the taxi driver and former elite commando major Korben Dallas that helps her to escape from the police. Leeloo tells him that she must meet Father Vito Cornelius to accomplish her mission. Meanwhile, the Evil uses the greedy and cruel Jean-Baptiste Emanuel Zorg and a team of mercenary Mangalores to retrieve the stones and avoid the protection of Leeloo. But the skilled Korben Dallas has fallen in love with Leeloo and decides to help her to retrieve the stones.", 
        "English, Swedish, German", 
        "France", 
        "Nominated for 1 Oscar. Another 9 wins & 33 nominations.",
        "http://ia.media-imdb.com/images/M/MV5BMTkzOTkwNTI4N15BMl5BanBnXkFtZTYwMDIzNzI5._V1_SX300.jpg", 
        "7.7"));
        list.add(new Movie( 1, "Independence Day", "1996", "PG-13",
        "03 Jul 1996", "145 min", "Action, Adventure, Sci-Fi",
        "Roland Emmerich", "Dean Devlin, Roland Emmerich",
        "Will Smith, Bill Pullman, Jeff Goldblum, Mary McDonnell",
        "On July 2nd, communications systems worldwide are sent into chaos by a strange atmospheric interference. It is soon learned by the military that a number of enormous objects are on a collision course with Earth. At first thought to be meteors, they are later revealed to be gigantic spacecraft, piloted by a mysterious alien species. After attempts to communicate with the aliens go nowhere, David Levinson, an ex-scientist turned cable technician, discovers that the aliens are going to attack major points around the globe in less than a day. On July 3rd, the aliens all but obliterate New York, Los Angeles and Washington, as well as Paris, London, Houston and Moscow. The survivors set out in convoys towards Area 51, a strange government testing ground where it is rumored the military has a captured alien spacecraft of their own. The survivors devise a plan to fight back against the enslaving aliens, and July 4th becomes the day humanity will fight for its freedom. July 4th is their Independence Day...", 
        "English", "USA", "Won 1 Oscar. Another 31 wins & 32 nominations.",
        "http://ia.media-imdb.com/images/M/MV5BMTMwODY3NzQzNF5BMl5BanBnXkFtZTcwNzUxNjc0MQ@@._V1_SX300.jpg",
        "6.9"));
        list.add(new Movie(2, "Frozen","2013", "PG","27 Nov 2013", "102 min", 
        "Animation, Adventure, Comedy", "Chris Buck, Jennifer Lee", 
        "Jennifer Lee (screenplay), Hans Christian Andersen (story inspired by \"The Snow Queen\" by), Chris Buck (story by), Jennifer Lee (story by), Shane Morris (story by)",
        "Kristen Bell, Idina Menzel, Jonathan Groff, Josh Gad", 
        "When the newly crowned Queen Elsa accidentally uses her power to turn things into ice to curse her home in infinite winter, her sister, Anna, teams up with a mountain man, his playful reindeer, and a snowman to change the weather condition.", 
        "English, Icelandic", "USA", "Won 2 Oscars. Another 70 wins & 56 nominations.", 
        "http://ia.media-imdb.com/images/M/MV5BMTQ1MjQwMTE5OF5BMl5BanBnXkFtZTgwNjk3MTcyMDE@._V1_SX300.jpg", "7.6" ));
        list.add(new Movie(3, "Furious 7", "2015", "PG-13", "03 Apr 2015", "137 min",
        "Action, Crime, Thriller", "James Wan", "Chris Morgan, Gary Scott Thompson (characters)",
        "Vin Diesel, Paul Walker, Jason Statham, Michelle Rodriguez", 
        "Dominic and his crew thought they'd left the criminal mercenary life behind. They'd defeated international terrorist Owen Shaw and went their separate ways. But now, Shaw's brother, Deckard Shaw, is out killing the crew one by one for revenge. Worse, a Somalian terrorist called Jakarde and a shady government official called \"Mr. Nobody\" are both competing to steal a computer terrorism program called \"God's Eye,\" that can turn any technological device into a weapon. Torretto must reconvene with his team to stop Shaw and retrieve the God's Eye program while caught in a power struggle between the terrorist and the United States government.",
        "English", "USA", "Nominated for 1 Golden Globe. Another 17 wins & 24 nominations.",
        "http://ia.media-imdb.com/images/M/MV5BMTQxOTA2NDUzOV5BMl5BanBnXkFtZTgwNzY2MTMxMzE@._V1_SX300.jpg", "7.3"));
        list.add(new Movie(4, "Predestination", "2014", "R", "09 Jan 2015", "97 min",
        "Drama, Mystery, Sci-Fi", "Michael Spierig, Peter Spierig", 
        "Michael Spierig, Peter Spierig, Robert A. Heinlein (story \"All You Zombies\")",
        "Ethan Hawke, Sarah Snook, Christopher Kirby, Christopher Sommers", 
        "PREDESTINATION chronicles the life of a Temporal Agent sent on an intricate series of time-travel journeys designed to ensure the continuation of his law enforcement career for all eternity. Now, on his final assignment, the Agent must pursue the one criminal that has eluded him throughout time.", 
        "English", "Australia", "10 wins & 18 nominations.", 
        "http://ia.media-imdb.com/images/M/MV5BMTAzODc3NjU1NzNeQTJeQWpwZ15BbWU4MDk5NTQ4NTMx._V1_SX300.jpg", "7.4"));
        list.add(new Movie(5, "The Hunger Games= Catching Fire", "2013", "PG-13", "22 Nov 2013", "146 min",
         "Adventure, Sci-Fi, Thriller", "Francis Lawrence", 
         "Simon Beaufoy (screenplay), Michael Arndt (screenplay), Suzanne Collins (novel)",
         "Jennifer Lawrence, Liam Hemsworth, Jack Quaid, Taylor St. Clair",
         "Katniss Everdeen and Peeta Mellark become targets of the Capitol after their victory in the 74th Hunger Games sparks a rebellion in the Districts of Panem.", 
         "English","USA","Nominated for 1 Golden Globe. Another 21 wins & 57 nominations.",
         "http://ia.media-imdb.com/images/M/MV5BMTAyMjQ3OTAxMzNeQTJeQWpwZ15BbWU4MDU0NzA1MzAx._V1_SX300.jpg", "7.6"));
        
        return list;
    }
    
    
    @Override
    public Response moviesGet(SecurityContext securityContext)
    throws NotFoundException {
        ArrayList<Movie> list = loadMovies();
        return Response.ok().entity(list).build();
    }
    
    @Override
    public Response moviesGetById(Integer id, SecurityContext securityContext)
    throws NotFoundException {
        ArrayList<Movie> list = loadMovies();
        Movie ret = null;

        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getID() == id)
            {
                ret = list.get(i);
            }
        }
        return Response.ok().entity(ret).build();
    }    
}
