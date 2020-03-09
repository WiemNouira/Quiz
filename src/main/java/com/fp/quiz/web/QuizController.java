package com.fp.quiz.web;

import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.dao.ResponseRepository;
import com.fp.quiz.dao.TestRepository;
import com.fp.quiz.entities.Participation;
import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.Response;
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
    private QuestionRepository questionRepository;
    @Autowired
    private ResponseRepository responseRepository;
    @Autowired
    private TestRepository participationRepository;
    @PostMapping("/addParticipation")
    public Participation addParticipation(@RequestBody TestForm testForm){
        System.out.println(testForm);
        
        int score=0;

        List<Response> reponses = new ArrayList<>();
        testForm.getReponses().forEach(  
    
        				reponseQ -> reponses.add(responseRepository.save(reponseQ))
        );
              
        Participation participation = new Participation();
        participation.setUsername(testForm.getUsername());
        participation.setReponses(testForm.getReponses());
        
        return participationRepository.save(participation); //reponses

        
        
    }
}
