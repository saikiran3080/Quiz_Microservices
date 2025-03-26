package com.quiz.controller;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizServices;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizServices quizServices;

    public QuizController(QuizServices quizServices) {
        this.quizServices = quizServices;
    }

//    create
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz)
    {

        return quizServices.add(quiz);
    }

//    getAll
    @GetMapping
    public List<Quiz> getAllQuiz()
    {
        return quizServices.get();
    }

//  get one quiz
    @GetMapping("/{id}")
    public Quiz getOneQuiz(@PathVariable Long id)
    {
        return quizServices.get(id);
    }

}
