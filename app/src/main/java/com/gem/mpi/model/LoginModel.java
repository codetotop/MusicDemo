package com.gem.mpi.model;

import java.io.Serializable;

public class LoginModel implements Serializable {
  private String actionToken;

  public String getActionToken() {
    return actionToken;
  }

  public void setActionToken(String actionToken) {
    this.actionToken = actionToken;
  }
}
