package com.example.song.service;

import com.example.song.repository.SongJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.song.repository.*;
import com.example.song.model.*;
import com.example.song.service.*;
import java.util.*;

@Service
public class SongJpaService implements SongRepository {
  @Autowired
  private SongJpaRepository songJpaRepository;

  @Override
  public ArrayList<Song> getAllSongs() {
    return new ArrayList<>(songJpaRepository.findAll());
  }

  @Override
  public Song getSongById(int songId) {
    try {
      Song song = songJpaRepository.findById(songId).get();
      return song;
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public Song postSong(Song song) {
    songJpaRepository.save(song);
    return song;
  }

  @Override
  public Song putSongint(int songId, Song song) {
    try {
      Song newSong = songJpaRepository.findById(songId).get();
      if (song.getSongName() != null) {
        newSong.setSongName(song.getSongName());
      }
      if (song.getLyricist() != null) {
        newSong.setLyricist(song.getLyricist());
      }
      if (song.getSinger() != null) {
        newSong.setSinger(song.getSinger());
      }
      if (song.getMusicDirector() != null) {
        newSong.setMusicDirector(song.getMusicDirector());
      }
      songJpaRepository.save(newSong);
      return newSong;
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public void deleteSong(int songId) {
    try {
      songJpaRepository.deleteById(songId);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.OK);
    }
    throw new ResponseStatusException(HttpStatus.NO_CONTENT);
  }
}