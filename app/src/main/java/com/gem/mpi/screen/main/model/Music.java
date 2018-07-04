package com.gem.mpi.screen.main.model;

public class Music {

  private String urlSong;
  private String nameSong;

  public Music() {
  }

  public Music(String urlSong, String nameSong) {
    this.urlSong = urlSong;
    this.nameSong = nameSong;
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
