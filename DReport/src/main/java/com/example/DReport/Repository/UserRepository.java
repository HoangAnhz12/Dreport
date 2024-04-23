package com.example.DReport.Repository;

import com.example.DReport.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {
     Optional<User> findBytaikhoan(String name);
}
