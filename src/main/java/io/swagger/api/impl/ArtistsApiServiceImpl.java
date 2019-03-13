package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Artist;

import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-02T00:03:42.567Z")
public class ArtistsApiServiceImpl extends ArtistsApiService {
    
    private ArrayList<Artist> loadArtists(){
        ArrayList<Artist> list = new ArrayList<Artist>();
        list.add(new Artist( 0, "Sabrina Carpenter", "http://img2-ak.lst.fm/i/u/328fbd766ec5d902f3279442d380fe8b.png",
        "Sabrina Carpenter (born May 11, 1999 to Elizabeth and David Carpenter) is an American singer and actress from East Greenville, Pennsylvania, USA. Sabrina began dancing at age two and not long after found her unique singing voice. She began vocal training at the age of seven and continues to develop and train her voice as well as learning to play guitar.\n​\nSabrina has released her first full-length album Eyes Wide Open was released on 14th April, 2015.  Sabrina has been signed to Hollywood Records since 2012. \n\nSabrina has also had many starring roles in both TV and in cinema, and is most famous for her current role starring as Maya Hart in Disney Channel series Girl Meets World, since it debuted in 2014.  Sabrina began acting in late 2010 and not long after, booked her first job as a guest star on \"Law & Order SVU\". From there she booked a lead role in the Disney Pilot \"Gulliver Quinn\". She has since played in two movies, 'Noobz\" in 2011 and \"Horns\" in 2012.", "http://www.last.fm/music/Sabrina+Carpenter"));
        list.add(new Artist( 1, "Taylor Swift", 
        "http://img2-ak.lst.fm/i/u/55d5786dbab44b8fcb94713994f951f5.png",
        "Taylor Alison Swift (born December 13, 1989 in Wyomissing, Pennsylvania) is an American country pop singer-songwriter and actress. Swift is a 8-time Grammy winner with a total of 23 nominations (Feb 2016).\n\nIn 2006, she released her debut single \"Tim McGraw\", then her self-titled debut album, which was subsequently certified multi-platinum by the Recording Industry Association of America.\n\nIn November 2008, Swift released her second album, Fearless, which featured a number of more pop oriented songs such as \"You Belong With Me\" and \"Love Story\". Fearless was the best-selling album in 2009 in the USA and was awarded with 4 Grammy's.\n\nSwift's third and fourth albums, 2010's \"Speak Now\" and 2012's \"Red\", both sold over one million copies within the first week of their US release. “Speak Now” won two Grammy Awards, while “Red’s” singles \" We Are Never Ever Getting Back Together \" and \" I Knew You Were Trouble\" were worldwide hits.\n\nThe 1989 was released on October 27, 2014. It marked a move away from her earlier country sounds and fully into pop. Both the title (\"1989\") and the overall sound of the album - synth pop - were a nod to her birth year and nostalgia with the 1980s. It became the best-selling album of 2014, selling 3.66m copies in USA, and as of April 2015, it had sold 4.5m copies in the US (9m worldwide).  The first single from the album was \"Shake It Off\" (released on August 18, 2014), which reached number one on the Billboard Hot 100.\n\nOn February 15, 2016, Taylor Swift won \"album of the year\" at the 58th Grammy Awards for \"1989\".",
        "http://www.last.fm/music/Taylor+Swift"));
        list.add(new Artist(2, "One Republic", 
        "http://img2-ak.lst.fm/i/u/c110a3cb963945cc812568c6bc4a347a.png",
        "Featuring the anthemic songwriting of Ryan Tedder, OneRepublic rose to prominence in 2007, when \"Apologize\" began its reign as the most popular digital download in American history. Although the song proved to be a quick success, OneRepublic had spent five years touring the musical minor leagues before its release, with Tedder splitting his time between the band's work and production gigs for other artists. Tedder and Zach Filkins formed the band in 2002 and relocated to Los Angeles shortly thereafter, adding keyboardist Drew Brown, bassist/cellist Brent Kutzle, and drummer Eddie Fisher to the lineup in the process. OneRepublic then signed with Sony BMG's Columbia label in 2003; three years later, however, the bandmates returned from a performance at Coachella to find themselves dropped from Columbia's roster.",
        "http://www.last.fm/music/+noredirect/One+Republic"));
        list.add( new Artist( 3, "Chromeo", 
        "http://img2-ak.lst.fm/i/u/d63643ca125e48e8bc7dc9051040ccc6.png",
        "Chromeo is an electrofunk duo based in Montreal, Canada and New York City. They are P-Thugg (Patrick Gemayel) on keyboards, synthesizers and talk box, and Dave 1 (David Macklovitch) on guitar and lead vocals. The two were best friends since childhood and officially formed the band in 2002. They describe themselves as the only successful Arab/Jewish collaboration since the beginning of time.\n\nDavid Macklovitch is currently earning his Ph.D in French literature from Columbia University, where he also teaches undergraduate French classes.\n\nHighlights of their 2004 debut album She's In Control include club tracks Needy Girl, Mercury Tears, Rage!, and Destination: Overdrive. In 2005, Chromeo released a mix CD of funky dance tracks on Eskimo Belgium records entitled Un Joli Mix Pour Toi (A Pretty Mix For You). During early 2007 Chromeo supported indie rock group Bloc Party on their British tour.\n\nTheir second album \"Fancy Footwork\", produced by Chromeo themselves with the help of Tiga and mixed by Philippe Zdar from Cassius, was released on June 26th, 2007.\n\nThe album took them on a two-year world tour performing in festivals such as Glastonbury, Reading and Leeds in the UK, Fujirock in Japan, Iceland Airwaves in Iceland, Pemberton Music Festival in Canada and Coachella, Bonnaroo, Rothbury Festival and Lollapalooza in the US.\n\nChromeo contributed to K7's mixed series titled DJ-Kicks: Chromeo. In summer 2010 the track ' Fancy Footwork' was used as the sound track for a VO5 Extreme Hair Gel advertisement in the UK. The YouTube video of the original release in 2008 had over 666,000 hits by late July 2010.\n\nChromeo released their third studio album entitled \"Business Casual\" on September 14, 2010.\n\nTheir song \" Don't Turn The Lights On\" is featured on the video game FIFA 11 exposing them to a new group of listeners. In 2011 the same song was also featured on the video game Dirt3. Their song Bonified Lovin (Yuksek remix) is also on the video game FIFA 09.\n\nAt the beginning of March 2011, Chromeo sent out notice that it had recorded the \"world's smallest album,\" entitled Drive Time, which consists of 55 songs in only 183 seconds. About a week later, it was revealed that Drive Time is actually a free musical Nokia Own Voice satellite navigation pack for Ovi Maps, made for usage with Nokia's compatible cell phones. A red vinyl 5\" single consisting of regular, instrumental and a cappella versions of \"Turn Left\" and \"Follow\" was released to promote it, with a sticker on the shrink wrap saying that it was a numbered limited edition of 40 copies.", "http://www.last.fm/music/Chromeo"));
        list.add(new Artist(4, "Avril Lavigne", 
        "http://img2-ak.lst.fm/i/u/8edc565e985b4acabef2122317889c30.png", 
        "Avril Ramona Lavigne (born on September 27, 1984 in Belleville, Ontario, Canada), professionally known as Avril Lavigne, is a Juno award-winning and Grammy-award nominated pop rock singer, songwriter. In 2002, Lavigne reached mainstream success after her debut single, Complicated, and her debut album Let Go, gained lots of media attention and honourably earned her reputation of a 'skater punk' persona and 'pop punk princess' when she was only 17 years old. Since her professional debut, Lavigne's honors notably are 8 Grammy award nominations as well as 8 Juno awards from 24 nominations. Lavigne is one of the top-selling artists releasing albums in the US, with over 11 million copies certified by the RIAA. To date, Lavigne has had 8 Top 20 Billboard Hot 100 hits, including the best-selling single in 2007, Girlfriend, which was released as the lead single from her third studio album, The Best Damn Thing. Lavigne has released 5 Top 5 Billboard 200 studio albums: Let Go (2002), Under My Skin (2004), The Best Damn Thing (2007), Goodbye Lullaby (2011), and Avril Lavigne (2013). As of April 2013, Lavigne has sold more than 30 million albums and 50 million singles worldwide.\nPersonal Life - in July 2013, Lavigne married Nickelback and fellow Canadian, Chad Kroeger. The couple met in July 2012 while working on Lavigne's single \"Here's To Never Growing Up\" and Kroeger proposed 1 month later. On Sept 3, 2015, after 2 years of marriage, the couple announced that they were separating.", 
        "http://www.last.fm/music/Avril+Lavigne"));
        
        return list;
    }
    
    @Override
    public Response artistsGet(SecurityContext securityContext)
    throws NotFoundException {
        ArrayList<Artist> list = loadArtists();
        return Response.ok().entity(list).build();
    }
    
    @Override
    public Response artistsGetById(Integer id, SecurityContext securityContext)
    throws NotFoundException {
        ArrayList<Artist> list = loadArtists();
        Artist ret = null;

        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).getID() == id)
            {
                ret = list.get(i);
                break;
            }
        }
        return Response.ok().entity(ret).build();
    }
    
}
