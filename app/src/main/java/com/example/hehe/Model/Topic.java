package com.example.hehe.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Topic {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("urlTopicPicture")
    @Expose
    private String urlTopicPicture;
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

    public String getUrlTopicPicture() {
        return urlTopicPicture;
    }

    public void setUrlTopicPicture(String urlTopicPicture) {
        this.urlTopicPicture = urlTopicPicture;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
