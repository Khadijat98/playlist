package com.example.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaylistController {
    @Autowired
    PlaylistRepository repository;
    // postman is giving me an empty line for getting the songs and an empty array for getting the playlist - kinda makes sense but want to clarify
    // how do i know the songs have populated the playlist table? doesn't feel like they have

    // returns a song - do i need to .findAll the songs?
    @GetMapping("/song/{id}")
        public ResponseEntity<Song> getSongById(@PathVariable String id) {
            return ResponseEntity.status(HttpStatus.OK).body(repository.findSongByid(Integer.parseInt(id)));
        }

    // create a playlist (add songs) endpoint
    @PostMapping("/playlist/create")
    public ResponseEntity<String> createPlaylist(@RequestBody Playlist playlist) {
        repository.save(playlist);
        return ResponseEntity.status(HttpStatus.CREATED).body("Hey " + playlist.getCreatedBy() + "! Your playlist, "
                + playlist.getPlaylistTitle() + " has been added!");
    }

    // view all playlists (pre-made and custom) endpoint
    @GetMapping("/playlists")
    public ResponseEntity<List<Playlist>> viewPlaylist() {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }

    // edit playlist (add/remove songs) endpoint - will these be separate? delete for remove and post for add?
    @PostMapping("/playlist/edit")
    public String editPlaylist() {
        return "Edit playlist";
    }

    // delete playlist (delete entire custom playlist) endpoint - how can i do this without an id?
    @DeleteMapping("playlist/{id}")
    public ResponseEntity<String> deletePlaylist(@PathVariable String id) {
        repository.deletePlaylistByid(Integer.parseInt(id));
        return ResponseEntity.status(HttpStatus.OK).body("Playlist with ID " + id + " has been deleted");
    }
}
