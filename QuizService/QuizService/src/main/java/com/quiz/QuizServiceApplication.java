package com.quiz;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class QuizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(QuizServices quizServices)
//	{
//		return  runner ->
//		{
//			seeQuiz(quizServices);
//		};
//	}
//
//	private void seeQuiz(QuizServices quizServices) {
//		Quiz q = new Quiz(1L,"Java Book");
//
//		System.out.println(q);
//	}

}
