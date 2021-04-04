package com.example.hehe.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Album {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("urlAlbumPicture")
    @Expose
    private String urlAlbumPicture;
    @SerializedName("singers")
    @Expose
    private List<Singers> singers = null;
    @SerializedName("songs")
    @Expose
    private List<Song> songs = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlAlbumPicture() {
        return urlAlbumPicture;
    }

    public void setUrlAlbumPicture(String urlAlbumPicture) {
        this.urlAlbumPicture = urlAlbumPicture;
    }

    public List<Singers> getSingers() {
        return singers;
    }

    public void setSingers(List<Singers> singers) {
        this.singers = singers;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
