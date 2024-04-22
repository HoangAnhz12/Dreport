package com.example.DReport.Service;

import com.example.DReport.DTO.LoginDTO;
import com.example.DReport.DTO.UserDTO;
import com.example.DReport.Model.User;
import com.example.DReport.Reponse.LoginResponse;
import com.example.DReport.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
//    @Override
//    public LoginResponse loginUser(LoginDTO loginDTO){
//
//    }

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
