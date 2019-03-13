package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Album;

import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class AlbumsartistIdidApiServiceImpl extends AlbumsartistIdidApiService {
    
    private ArrayList<Album> loadAlbums()
    {
        ArrayList<Album> list = new ArrayList<Album>();
        list.add(new Album(0,0, "Eyes Wide Open",
        "http://www.last.fm/music/Sabrina+Carpenter/Eyes+Wide+Open",
        "http://img2-ak.lst.fm/i/u/385cb47c90284b2ecb5b53e7e3d3cb30.png",
        "5767","84832"));
        list.add(new Album(1, 0, "Smoke and Fire",
        "http://www.last.fm/music/Sabrina+Carpenter/Smoke+and+Fire",
        "http://img2-ak.lst.fm/i/u/f8750ffd39d877105eb5a5d0812ce0bd.png",
        "1309", "4066"));
        list.add( new Album(2, 1, "1989",
        "http://www.last.fm/music/Taylor+Swift/1989",
        "http://img2-ak.lst.fm/i/u/7eb6cacc9dae4d3ccd436317add8cf4c.png",
        "92014", "9146458"));
        list.add( new Album(3,1,"Speak Now",
        "http://www.last.fm/music/Taylor+Swift/Speak+Now",
        "http://img2-ak.lst.fm/i/u/33f329a207cd48d5935617080eda0ea0.png",
        "370710", "10753353"));
        list.add( new Album(4, 1, "Fearless",
        "http://www.last.fm/music/Taylor+Swift/Fearless",
        "http://img2-ak.lst.fm/i/u/11b179a18eb7456c8cce4a85f0b35cea.png",
        "828720", "19421515"));
        list.add( new Album(5, 2,"Native",
        "http://www.last.fm/music/One+Republic/Native",
        "http://img2-ak.lst.fm/i/u/69c2cf452df94590a8b4af1e431ef458.png",
        "0", "0"));
        list.add( new Album(6, 3, "White Women",
        "http://www.last.fm/music/Chromeo/White+Women",
        "http://img2-ak.lst.fm/i/u/057822d679dc429ec276a0a324a1138a.png",
        "104073", "1562354"));
        list.add(new Album(7, 4, "Avril Lavigne",
        "http://www.last.fm/music/Avril+Lavigne/Avril+Lavigne",
        "http://img2-ak.lst.fm/i/u/4e775debb1cb445e9f711e34bfba2715.png",
        "120378","4959505"));
        list.add( new Album( 8, 4, "Let Go",
        "http://www.last.fm/music/Avril+Lavigne/Let+Go",
        "http://img2-ak.lst.fm/i/u/5cf851439e0945dec5573aac4a9553f6.png",
        "18449468", "1018005"));
        return list;
    }
    
    @Override
    public Response albumsGetByArtistId(Integer id, SecurityContext securityContext)
    throws NotFoundException {
        ArrayList<Album> list = loadAlbums();
        ArrayList<Album> ret = new ArrayList<Album>();

        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getArtist() == id)
            {
                ret.add(list.get(i));
                
            }
        }
        return Response.ok().entity(ret).build();
    }
    
}
