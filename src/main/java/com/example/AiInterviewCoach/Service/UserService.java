package com.example.AiInterviewCoach.Service;

import com.example.AiInterviewCoach.Entity.UserEntity;
import com.example.AiInterviewCoach.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String userinfo(){
        UserEntity user = userRepository.findByUserId("test1");
        return user.getUserId();
    }


}
