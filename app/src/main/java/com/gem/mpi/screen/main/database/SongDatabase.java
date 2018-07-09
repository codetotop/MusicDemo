package com.gem.mpi.screen.main.database;

import com.gem.mpi.realm.RealmController;
import com.gem.mpi.screen.main.model.Song;

import io.realm.Realm;

public class SongDatabase {
  Realm realm;

  public void addSong(Song song) {
    Realm realm = RealmController.getInstance().getRealm();
    realm.beginTransaction();
    song = realm.createObject(Song.class);
    song.setNameSong(song.getNameSong());
    song.setUrlSong(song.getUrlSong());
    realm.commitTransaction();
  }

  public boolean updateSong(Song song) {
    Realm realm = RealmController.getInstance().getRealm();
    realm.executeTransaction(new Realm.Transaction() {
      @Override
      public void execute(Realm realm) {
        //song = realm.createObject(Song.class);
      }
    });
    return true;
  }


}
