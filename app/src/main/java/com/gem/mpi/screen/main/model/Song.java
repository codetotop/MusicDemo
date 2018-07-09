package com.gem.mpi.screen.main.model;

import io.realm.RealmObject;

public class Song extends RealmObject {
  private String nameSong;
  private String urlSong;

  public Song() {
  }

  public Song(String nameSong, String urlSong) {
    this.nameSong = nameSong;
    this.urlSong = urlSong;
  }

  public String getUrlSong() {
    return urlSong;
  }

  public void setUrlSong(String urlSong) {
    this.urlSong = urlSong;
  }

  public String getNameSong() {
    return nameSong;
  }

  public void setNameSong(String nameSong) {
    this.nameSong = nameSong;
  }
}
