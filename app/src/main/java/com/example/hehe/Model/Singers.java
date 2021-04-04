package com.example.hehe.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Singers {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("urlSingerPicture")
    @Expose
    private String urlSingerPicture;
    @SerializedName("albums")
    @Expose
    private List<Object> albums = null;

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

    public String getUrlSingerPicture() {
        return urlSingerPicture;
    }

    public void setUrlSingerPicture(String urlSingerPicture) {
        this.urlSingerPicture = urlSingerPicture;
    }

    public List<Object> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Object> albums) {
        this.albums = albums;
    }

}