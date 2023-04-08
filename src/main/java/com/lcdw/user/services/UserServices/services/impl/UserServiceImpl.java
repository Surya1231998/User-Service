package com.lcdw.user.services.UserServices.services.impl;


import com.lcdw.user.services.UserServices.entities.User;
import com.lcdw.user.services.UserServices.exceptions.ResourceNotFoundException;
import com.lcdw.user.services.UserServices.repositories.UserRepository;
import com.lcdw.user.services.UserServices.services.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //Generate unique userId
       String randomUserId =  UUID.randomUUID().toString();
       user.setUserId(randomUserId);
        return userRepository.save(user)  ;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException());
    }
}
