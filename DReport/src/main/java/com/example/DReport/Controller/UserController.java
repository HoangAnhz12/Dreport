package com.example.DReport.Controller;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Model.User;
import com.example.DReport.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PostExchange;

import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public String saveUser(@RequestBody UserDTO userDTO){
        String id= userService.createUser(userDTO);
        return id;
    }
    @GetMapping("/")
    public String helo (){
        return "ahelo";
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO){
        return this.userService.loginUser(loginDTO);
    }
}
