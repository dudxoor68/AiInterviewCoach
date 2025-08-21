package com.example.AiInterviewCoach.Repository;

import com.example.AiInterviewCoach.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserId(String user_id);

}
