package com.MP3Player.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown=true)
public  class Track{
    private Long id;
    private String title;
    private String preview;
    private Artist artist;

    @Override
    public String toString()
    {
      return String.format(
        
        """
          Id: %d,
          Title: %s,
          Artist: %s,      
                
        """,
        id,
        title,
        artist.getName()
        );
    }
    public Track(){

    }
    public Track(Long id,String title,String preview,Artist artist)
    {
       this.id = id;
       this.title = title;
       this.preview = preview;
       this.artist = artist;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public void setPreview(String preview){
        this.preview = preview;
    }
    public void setArtist(Artist artist)
    {
     this.artist = artist;
    }
    public Long getId()
    {
        return this.id;
    }
    public String getTitle()
    {
        return  this.title;
    }
    public String getPreview()
    {
        return  this.preview;
    }
    public Artist getArtist()
    {
        return this.artist;
    }
}
