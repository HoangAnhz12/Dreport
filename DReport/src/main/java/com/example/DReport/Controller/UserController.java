package com.example.DReport.Controller;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Reponse.LoginResponse;
import com.example.DReport.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id= userService.createUser(userDTO);
        return id;
    }
//    @PostMapping("/login")
//    public ResponseEntity<?> LoginUser(@RequestBody LoginDTO loginDTO){
//        LoginResponse loginMessage=userService.loginUser(loginDTO);
//        return ResponseEntity.ok("heelo");
//    }
}
