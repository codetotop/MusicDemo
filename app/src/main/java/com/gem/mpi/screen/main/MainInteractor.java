package com.gem.mpi.screen.main;

import com.gem.mpi.screen.main.asyntask.MusicAsyntask;
import com.gem.mpi.screen.main.model.Song;
import com.gemvietnam.base.viper.Interactor;

import java.util.ArrayList;


/**
 * The Main interactor
 */
class MainInteractor extends Interactor<MainContract.Presenter>
    implements MainContract.Interactor, MusicAsyntask.DownloadData {
  MusicAsyntask musicAsyntask;

  MainInteractor(MainContract.Presenter presenter) {
    super(presenter);
  }

  @Override
  public void handleDownloadSong(ArrayList<Song> songs) {
    musicAsyntask = new MusicAsyntask(songs, this);//download music in AsyncTask
  }

  @Override
  public void statusDownload(String string) {
      mPresenter.getView().finalDownload(string);
  }
}
