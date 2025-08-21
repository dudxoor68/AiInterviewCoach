package com.example.AiInterviewCoach.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 50)
    private String userId;

    @Column(length = 255)
    private String userPassword;

    @Column(length = 255, unique = true)
    private String userEmail;


}
