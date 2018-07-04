package com.gem.mpi.mapper;

import com.gem.mpi.data.dto.LoginDTO;
import com.gem.mpi.model.LoginModel;

public class LoginMapper {

  public static LoginModel transform(LoginDTO loginDTO) {
    LoginModel loginModel = new LoginModel();
    loginModel.setActionToken(loginDTO.getAccessToken());
    return loginModel;

  }
}
