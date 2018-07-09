package com.gem.mpi.screen.main;

import android.os.Bundle;

import com.gem.mpi.R;
import com.gemvietnam.base.viper.ViewFragment;

/**
 * The Main Fragment
 */
public class MainFragment extends ViewFragment<MainContract.Presenter> implements MainContract.View {
  public static MainFragment getInstance(Bundle data) {
    MainFragment mainFragment = new MainFragment();
    mainFragment.setArguments(data);
    return mainFragment;
  }

  @Override
  protected int getLayoutId() {
    return R.layout.fragment_main;
  }

  @Override
  public void onDisplay() {
    super.onDisplay();
  }

  @Override
  public void onStart() {
    super.onStart();
  }

  @Override
  public void finalDownload(String msg) {
    showToast(msg);
  }
}
