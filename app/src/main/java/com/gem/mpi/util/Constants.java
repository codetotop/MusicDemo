package com.gem.mpi.util;

import android.os.Environment;

public interface Constants {
  String LOGIN_ACTION_DELETE = "delete";
  String LOGIN_ACTION_VIEW = "view";
  String LOGIN_ACTION_UNVIEW = "unview";

    String PREFIX_DOC_SYMBOL = "Ký hiệu văn bản: ";
  String PREFIX_NEW_IDEA = "Ý kiến xử lý mới: \n";
  String PREFIX_DURATION = "Thời hạn: ";

  public static String ROOT_PATH = Environment.getExternalStorageDirectory().getPath() +  "/gem/music/";
}
