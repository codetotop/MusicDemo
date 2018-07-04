package com.gem.mpi.screen.main;

import com.gemvietnam.base.viper.interfaces.IInteractor;
import com.gemvietnam.base.viper.interfaces.IPresenter;
import com.gemvietnam.base.viper.interfaces.PresentView;

/**
 * The Main Contract
 */
interface MainContract {

  interface Interactor extends IInteractor<Presenter> {
      void handleDownloadSong(String url);
  }

  interface View extends PresentView<Presenter> {

  }

  interface Presenter extends IPresenter<View, Interactor> {
    void sendRequestDownloadSong(String url);

  }
}



