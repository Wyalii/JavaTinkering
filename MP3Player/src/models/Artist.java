public class Artist{
    private  Integer ID;
    private  String Name;
    private  String Picture;
    public Artist(Integer id, String name, String picture){
        this.ID = id;
        this.Name = name;
        this.Picture = picture; 
    }
    public Integer getId()
    {
        return this.ID;
    }
    public String getName()
    {
        return  this.Name;
    }
    public String getPicture()
    {
        return  this.Picture;
    }
}