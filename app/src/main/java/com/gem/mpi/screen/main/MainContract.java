package com.gem.mpi.screen.main;

import com.gem.mpi.screen.main.model.Song;
import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;

import java.util.ArrayList;

/**
 * The Main Contract
 */
interface MainContract {

  interface Interactor extends IInteractor<Presenter> {
      void handleDownloadSong(ArrayList<Song> songs);
  }

  interface View extends PresentView<Presenter> {
      void finalDownload(String msg);
  }

  interface Presenter extends IPresenter<View, Interactor> {
    void sendRequestDownloadSong(ArrayList<Song> songs);

  }
}



