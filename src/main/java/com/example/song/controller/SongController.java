package com.example.song.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.song.model.*;
import com.example.song.service.*;
import java.util.*;

@RestController
public class SongController {
  @Autowired
  private SongJpaService songJpaService;

  @GetMapping("/songs")
  public ArrayList<Song> getAllSongs() {
    return songJpaService.getAllSongs();
  }

  @GetMapping("/songs/{songId}")
  public Song getSongById(@PathVariable("songId") int songId) {
    return songJpaService.getSongById(songId);
  }

  @PostMapping("/songs")
  public Song postSong(@RequestBody Song song) {
    return songJpaService.postSong(song);
  }

  @PutMapping("/songs/{songId}")
  public Song putSongint(@PathVariable("songId") int songId, @RequestBody Song song) {
    return songJpaService.putSongint(songId, song);
  }

  @DeleteMapping("/songs/{songId}")
  public void deleteSong(@PathVariable("songId") int songId)
  {
      songJpaService.deleteSong(songId);
    
  }

}