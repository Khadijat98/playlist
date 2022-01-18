package com.example.playlist;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String playlistTitle;
    private String createdBy;
    private String playlistDescription;
    private String playlistImgUrl;
    private String songID;


    public Playlist(int id, String playlistTitle, String createdBy, String playlistDescription, String playlistImgUrl, String songID) {
        this.id = id;
        this.playlistTitle = playlistTitle;
        this.createdBy = createdBy;
        this.playlistDescription = playlistDescription;
        this.playlistImgUrl = playlistImgUrl;
        this.songID = songID;
    }

    public Playlist() {

    }

    public int getId() {
        return id;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getPlaylistDescription() {
        return playlistDescription;
    }

    public String getPlaylistImgUrl() {
        return playlistImgUrl;
    }

    public String getSongID() {
        return songID;
    }
}
