package com.question.QuestionService.controllers;

import com.question.QuestionService.entities.Question;
import com.question.QuestionService.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

//    create
    @PostMapping
    public Question create(@RequestBody Question body)
    {
//        System.out.println("QuestionBody: " +body.getQuestion());
//        return null;
        return questionService.create(body);
    }

//    getAll
    @GetMapping
    public List<Question> getAll()
    {
        return questionService.get();
    }

//    getOne
    @GetMapping("/{id}")
    public Question getOne(@PathVariable Long id)
    {
        return questionService.getOne(id);
    }

//    get all questions of specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId)
    {
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
