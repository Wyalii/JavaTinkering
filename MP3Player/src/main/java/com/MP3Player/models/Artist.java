package  com.MP3Player.models;
public class Artist{
    private  Integer id;
    private  String name;
    private  String picture;
    public Artist(Integer id, String name, String picture){
        this.id = id;
        this.name = name;
        this.picture = picture; 
    }
    public Integer getid()
    {
        return this.id;
    }
    public String getname()
    {
        return  this.name;
    }
    public String getpicture()
    {
        return  this.picture;
    }
}