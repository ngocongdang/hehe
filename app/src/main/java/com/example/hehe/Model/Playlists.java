package com.example.hehe.Model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Playlists {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("urlPlaylistPicture")
    @Expose
    private String urlPlaylistPicture;
    @SerializedName("urlIcon")
    @Expose
    private String urlIcon;
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

    public String getUrlPlaylistPicture() {
        return urlPlaylistPicture;
    }

    public void setUrlPlaylistPicture(String urlPlaylistPicture) {
        this.urlPlaylistPicture = urlPlaylistPicture;
    }

    public String getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(String urlIcon) {
        this.urlIcon = urlIcon;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}
