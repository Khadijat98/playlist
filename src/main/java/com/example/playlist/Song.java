package com.example.playlist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String songTitle;
    private int releaseDate;
    private String songMediaUrl;

    public Song() {

    }

    public Song(String songTitle, int releaseDate, String songMediaUrl) {
        this.songTitle = songTitle;
        this.releaseDate = releaseDate;
        this.songMediaUrl = songMediaUrl;
    }

    public int getId() {
        return id;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getSongMediaUrl() {
        return songMediaUrl;
    }
}


