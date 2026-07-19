package com.MP3Player.models;
public  class Track{
    private Integer id;
    private String title;
    private String preview;
    private Artist artist;

    public Track(Integer id,String title,String preview,Artist artist)
    {
       this.id = id;
       this.title = title;
       this.preview = preview;
       this.artist = artist;
    }
    public Integer getid()
    {
        return this.id;
    }
    public String gettitle()
    {
        return  this.title;
    }
    public String getpreview()
    {
        return  this.preview;
    }
    public Artist getArtist()
    {
        return this.artist;
    }
}
