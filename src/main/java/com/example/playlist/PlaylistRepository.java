package com.example.playlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, String> {
    Song findSongByid(int id);

    Playlist deletePlaylistByid(int id);
}
