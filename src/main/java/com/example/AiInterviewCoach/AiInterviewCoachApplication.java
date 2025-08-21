package com.example.AiInterviewCoach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiInterviewCoachApplication {

	public static void main(String[] args) {

		try {
			SpringApplication.run(AiInterviewCoachApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}


	}

}
