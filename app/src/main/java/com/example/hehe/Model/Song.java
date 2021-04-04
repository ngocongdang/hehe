package com.example.hehe.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Song {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("songName")
    @Expose
    private String songName;
    @SerializedName("urlPicture")
    @Expose
    private String urlPicture;
    @SerializedName("urlSong")
    @Expose
    private String urlSong;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("singers")
    @Expose
    private Singers singers;
    @SerializedName("comments")
    @Expose
    private List<Comment> comments = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public String getUrlSong() {
        return urlSong;
    }

    public void setUrlSong(String urlSong) {
        this.urlSong = urlSong;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Singers getSingers() {
        return singers;
    }

    public void setSingers(Singers singers) {
        this.singers = singers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

}