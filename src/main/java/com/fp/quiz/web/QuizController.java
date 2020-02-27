package com.fp.quiz.web;

import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.dao.TestRepository;
import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.Test;
import com.fp.quiz.models.TestForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RequestMapping("/test")
@RestController
public class QuizController {
    @Autowired
    private TestRepository testRepository;
    @Autowired
    private QuestionRepository questionRepository;
    @PostMapping("/addTest")
    public Test addTest(@RequestBody TestForm testForm){
        System.out.println(testForm);
        List<Question> questions = new ArrayList<>();
        testForm.getQuestions().forEach(
            question -> questions.add(questionRepository.save(question))
        );
        questions.forEach(question -> System.out.println(question));
        Test test = new Test();
        test.setUsername(testForm.getUsername());
        test.setQuestions(questions);
        return testRepository.save(test);

        
        
    }
}
