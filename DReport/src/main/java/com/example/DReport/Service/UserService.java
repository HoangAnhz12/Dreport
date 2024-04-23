package com.example.DReport.Service;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Model.User;

public interface UserService {
    String createUser(UserDTO userDTO);
    String loginUser(LoginDTO loginDTO);
    User updateUser(User user);
    User getProductById(Long userId);
    void deletedUser(long id);
}
