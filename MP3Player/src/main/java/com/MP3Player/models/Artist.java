package  com.MP3Player.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public class Artist{
    private  Long id;
    private  String name;
    private  String picture;
    @Override
    public String toString()
    {
        return "Artist{" +
               "id=" + id +
               ", name='" + name + '\'' +
             ", picture='" + picture + '\'' + '}';
    }
    public Artist()
    {

    }
    public Artist(Long id, String name, String picture){
        this.id = id;
        this.name = name;
        this.picture = picture; 
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPicture(String picture)
    {
        this.picture = picture;
    }
    public Long getId()
    {
        return this.id;
    }
    public String getName()
    {
        return  this.name;
    }
    public String getPicture()
    {
        return  this.picture;
    }
}