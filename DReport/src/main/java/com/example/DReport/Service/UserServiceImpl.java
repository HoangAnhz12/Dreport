package com.example.DReport.Service;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Model.User;
import com.example.DReport.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public String createUser(UserDTO userDTO){
        User user= new User(

                userDTO.getId(),
                userDTO.getName(),
                userDTO.getTaikhoan(),
                this.passwordEncoder.encode(userDTO.getMatkhau())
        );

        userRepository.save(user);
        return user.getName();
    }
    @Override
    public String loginUser(LoginDTO loginDTO){
        try {
            String username = loginDTO.getTaikhoan();
            String password = loginDTO.getMatkhau();
            Optional<User> user = this.userRepository.findBytaikhoan(username);
            if(user.isPresent())
                return "true";
            return "falase";
        }catch (Exception e){
            return  "fale";
        }

    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getProductById(Long userId) {

            Optional<User> user = this.userRepository.findById(userId);
            if(user.isPresent())
            {
                return user.get();
            }
            else {
                throw  new IOException()
            }

    }


    @Override
    public void deletedUser(long id) {

    }

//    @Override
//    public User updateUser(User user) {
//        return null;
//    }
//
//    @Override
//    public User getProductById(Long userId) {
//        return null;
//    }
//
//    @Override
//    public void deletedUser(long id) {

//    }

}
