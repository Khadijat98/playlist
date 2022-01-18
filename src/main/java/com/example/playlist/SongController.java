package com.example.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SongController {
    @Autowired
    SongRepository songRepository;

    @GetMapping("/song/{id}")
    public ResponseEntity<Song> getSongById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(songRepository.findSongByid(Integer.parseInt(id)));
    }

    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getSongs() {
        return ResponseEntity.status(HttpStatus.OK).body(songRepository.findAll());
    }
}
