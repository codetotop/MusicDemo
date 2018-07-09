package com.gem.mpi.screen.main.asyntask;

import android.os.AsyncTask;
import android.util.Log;

import com.gem.mpi.realm.RealmController;
import com.gem.mpi.screen.main.model.Song;
import com.gem.mpi.util.Constants;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.UUID;

public class MusicAsyntask extends AsyncTask<ArrayList<Song>, Long, String> {
  private int dem = 0;
  private DownloadData downloadData;

  public MusicAsyntask(ArrayList<Song> songs, DownloadData downloadData) {
    download(songs);
     this.downloadData = downloadData;
  }

  public void download(ArrayList<Song> songs) {
    execute(songs);
  }

  @Override
  protected void onPreExecute() {
    super.onPreExecute();
  }

  @Override
  protected String doInBackground(ArrayList<Song>... musics) {
    try {
      while (dem <= musics[0].size()) {
        Song song = musics[0].get(dem);
        String path = Constants.ROOT_PATH + song.getNameSong() + ".mp3";

        URL url = new URL(song.getUrlSong());
        URLConnection connection = url.openConnection();
        InputStream is = connection.getInputStream();

        File f = new File(path);
        if (!f.getParentFile().exists())
          f.getParentFile().mkdirs();
        if (f.exists()) {
          String id = UUID.randomUUID().toString();
          path = Constants.ROOT_PATH + song.getNameSong() + "(" + getSerialSong(f.getParentFile(), song.getNameSong()) + ")" + ".mp3";
          Log.e("ABCDE", "doInBackground: " + path);
          f = new File(path);
        }
        f.createNewFile();
        FileOutputStream os = new FileOutputStream(f);
        byte[] b = new byte[1024];
        int lenght = is.read(b);
        while (lenght != -1) {
          os.write(b, 0, lenght);
          lenght = is.read(b);
        }
        dem++;
      }
      return "Success";
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "Error";
  }

  public int getSerialSong(File f, String nameSong) {
    int serial = 0;
    File[] files = f.listFiles();
    for (File file : files) {
      if (file.getPath().contains(nameSong))
        serial++;
    }
    return serial;
  }

  @Override
  protected void onProgressUpdate(Long... values) {
    super.onProgressUpdate(values);
  }

  @Override
  protected void onPostExecute(String s) {
    super.onPostExecute(s);
    downloadData.statusDownload(s);
  }

  public interface DownloadData {
    void statusDownload(String string);

  }
}
