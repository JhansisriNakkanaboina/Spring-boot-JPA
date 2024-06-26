package com.example.song.model;

import javax.persistence.*;

@Entity
@Table(name = "playlist")
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "songid")
  int songId;

  @Column(name = "songname")
  String songName;

  @Column(name = "lyricist")
  String lyricist;

  @Column(name = "singer")
  String singer;

  @Column(name = "musicdirector")
  String musicDirector;

  public Song() {

  }

  public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
    this.songId = songId;
    this.songName = songName;
    this.lyricist = lyricist;
    this.singer = singer;
    this.musicDirector = musicDirector;
  }

  public void setSongId(int songId) {
    this.songId = songId;
  }

  public int getSongId() {
    return this.songId;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  public String getSongName() {
    return this.songName;
  }

  public void setLyricist(String lyricist) {
    this.lyricist = lyricist;
  }

  public String getLyricist() {
    return this.lyricist;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  public String getSinger() {
    return this.singer;
  }

  public void setMusicDirector(String musicDirector) {
    this.musicDirector = musicDirector;
  }

  public String getMusicDirector() {
    return this.musicDirector;
  }
}