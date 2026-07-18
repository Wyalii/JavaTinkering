public class Track{
    private Integer ID;
    private String Title;
    private String Preview;
    private Artist Artist;

    public Track(Integer Id,String title,String Preview,Artist artist)
    {
       this.ID = Id;
       this.Title = title;
       this.Preview = Preview;
       this.Artist = artist;
    }
    public Integer getId()
    {
        return this.ID;
    }
    public String getTitle()
    {
        return  this.Title;
    }
    public String getPreview()
    {
        return  this.Preview;
    }
    public Artist getArtist()
    {
        return this.Artist;
    }
}

