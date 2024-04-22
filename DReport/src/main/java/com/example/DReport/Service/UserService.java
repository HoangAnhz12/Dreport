package com.example.DReport.Service;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Reponse.LoginResponse;

public interface UserService {
    String createUser(UserDTO userDTO);
//    LoginResponse loginUser(LoginDTO loginDTO);
//    User updateUser(User user);
//    User getProductById(Long userId);
//    void deletedUser(long id);
}
