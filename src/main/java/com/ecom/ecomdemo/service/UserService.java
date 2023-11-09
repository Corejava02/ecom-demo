package com.ecom.ecomdemo.service;

import com.ecom.ecomdemo.entity.UserEntity;
import com.ecom.ecomdemo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public void addUser(UserEntity user){
        userRepository.save(user);
    }

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public List<UserEntity> getAllFilteredUsers(String name){
        return userRepository.findByName(name);
    }
}
