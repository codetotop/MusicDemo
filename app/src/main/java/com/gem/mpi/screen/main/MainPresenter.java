package com.gem.mpi.screen.main;

import android.os.Bundle;

import com.gem.mpi.screen.main.model.Song;
import com.gemvietnam.base.viper.Presenter;
import com.gemvietnam.base.viper.interfaces.ContainerView;

import java.util.ArrayList;

/**
 * The Main Presenter
 */
public class MainPresenter extends Presenter<MainContract.View, MainContract.Interactor>
    implements MainContract.Presenter {
  public MainPresenter(ContainerView containerView) {
    super(containerView);
  }
  public String urls = "https://zmp3-mp3-s1.zadn.vn/9c6234225466bd38e477/1063619207833178422?authen=exp=1531179493~acl=/9c6234225466bd38e477/*~hmac=e896fbdae6d8a425456a640cac45ca86";
  public ArrayList<Song> songs = new ArrayList<>();
  @Override
  public void start() {
    songs.add(new Song("Gọi Tên Em Trong Đêm","https://zmp3-mp3-s1.zadn.vn/9c6234225466bd38e477/1063619207833178422?authen=exp=1531179493~acl=/9c6234225466bd38e477/*~hmac=e896fbdae6d8a425456a640cac45ca86"));
    songs.add(new Song("Đừng Như Thói Quen","https://zmp3-mp3-s1-te-vnno-zn-5.zadn.vn/eca53988eecc07925edd/7423535743815512881?authen=exp=1531178409~acl=/eca53988eecc07925edd/*~hmac=e3d66dadde8dfc0858b1133f30aae909"));
    songs.add(new Song("Tâm Sự Tuổi 30","https://zmp3-mp3-s1.zadn.vn/7fad6752b01659480007/7105990493802972886?authen=exp=1531182669~acl=/7fad6752b01659480007/*~hmac=8669cae793dd98ed259f453b88e952c5"));
    songs.add(new Song("Tình Đơn Phương","https://zmp3-mp3-s1.zadn.vn/2bc144b39ef777a92ee6/3574895072993070020?authen=exp=1531183232~acl=/2bc144b39ef777a92ee6/*~hmac=9b614398691724139bd20591ccba2e05"));
    songs.add(new Song("Gọi Tên Em Trong Đêm","https://zmp3-mp3-s1.zadn.vn/9c6234225466bd38e477/1063619207833178422?authen=exp=1531179493~acl=/9c6234225466bd38e477/*~hmac=e896fbdae6d8a425456a640cac45ca86"));
    songs.add(new Song("Đừng Như Thói Quen","https://zmp3-mp3-s1-te-vnno-zn-5.zadn.vn/eca53988eecc07925edd/7423535743815512881?authen=exp=1531178409~acl=/eca53988eecc07925edd/*~hmac=e3d66dadde8dfc0858b1133f30aae909"));
    songs.add(new Song("Tâm Sự Tuổi 30","https://zmp3-mp3-s1.zadn.vn/7fad6752b01659480007/7105990493802972886?authen=exp=1531182669~acl=/7fad6752b01659480007/*~hmac=8669cae793dd98ed259f453b88e952c5"));
    songs.add(new Song("Tình Đơn Phương","https://zmp3-mp3-s1.zadn.vn/2bc144b39ef777a92ee6/3574895072993070020?authen=exp=1531183232~acl=/2bc144b39ef777a92ee6/*~hmac=9b614398691724139bd20591ccba2e05"));
    songs.add(new Song("Gọi Tên Em Trong Đêm","https://zmp3-mp3-s1.zadn.vn/9c6234225466bd38e477/1063619207833178422?authen=exp=1531179493~acl=/9c6234225466bd38e477/*~hmac=e896fbdae6d8a425456a640cac45ca86"));
    songs.add(new Song("Đừng Như Thói Quen","https://zmp3-mp3-s1-te-vnno-zn-5.zadn.vn/eca53988eecc07925edd/7423535743815512881?authen=exp=1531178409~acl=/eca53988eecc07925edd/*~hmac=e3d66dadde8dfc0858b1133f30aae909"));
    songs.add(new Song("Tâm Sự Tuổi 30","https://zmp3-mp3-s1.zadn.vn/7fad6752b01659480007/7105990493802972886?authen=exp=1531182669~acl=/7fad6752b01659480007/*~hmac=8669cae793dd98ed259f453b88e952c5"));
    songs.add(new Song("Tình Đơn Phương","https://zmp3-mp3-s1.zadn.vn/2bc144b39ef777a92ee6/3574895072993070020?authen=exp=1531183232~acl=/2bc144b39ef777a92ee6/*~hmac=9b614398691724139bd20591ccba2e05"));
    songs.add(new Song("Gọi Tên Em Trong Đêm","https://zmp3-mp3-s1.zadn.vn/9c6234225466bd38e477/1063619207833178422?authen=exp=1531179493~acl=/9c6234225466bd38e477/*~hmac=e896fbdae6d8a425456a640cac45ca86"));
    songs.add(new Song("Đừng Như Thói Quen","https://zmp3-mp3-s1-te-vnno-zn-5.zadn.vn/eca53988eecc07925edd/7423535743815512881?authen=exp=1531178409~acl=/eca53988eecc07925edd/*~hmac=e3d66dadde8dfc0858b1133f30aae909"));
    songs.add(new Song("Tâm Sự Tuổi 30","https://zmp3-mp3-s1.zadn.vn/7fad6752b01659480007/7105990493802972886?authen=exp=1531182669~acl=/7fad6752b01659480007/*~hmac=8669cae793dd98ed259f453b88e952c5"));
    songs.add(new Song("Tình Đơn Phương","https://zmp3-mp3-s1.zadn.vn/2bc144b39ef777a92ee6/3574895072993070020?authen=exp=1531183232~acl=/2bc144b39ef777a92ee6/*~hmac=9b614398691724139bd20591ccba2e05"));
   sendRequestDownloadSong(songs);
  }

  @Override
  public MainContract.Interactor onCreateInteractor() {
    return new MainInteractor(this);
  }

  @Override
  public MainContract.View onCreateView(Bundle data) {
    return MainFragment.getInstance(data);
  }

  @Override
  public void sendRequestDownloadSong(ArrayList<Song> songs) {
    mInteractor.handleDownloadSong(songs);
  }
}
