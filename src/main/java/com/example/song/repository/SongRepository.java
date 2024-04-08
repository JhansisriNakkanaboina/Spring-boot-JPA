package com.example.song.repository;

import com.example.song.model.*;
import java.util.*;

public interface SongRepository {
  ArrayList<Song> getAllSongs();

  Song getSongById(int songId);

  Song postSong(Song song);

  Song putSongint(int songId, Song song);

  void deleteSong(int songId);
}