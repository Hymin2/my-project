package com.myproject.user.service;

import com.myproject.user.entity.User;
import com.myproject.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findByUserId(String userId){
        return userRepository.findByUserId(userId).get();
    }
}
