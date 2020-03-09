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
    
   /* 
    @PostMapping("/addTest")
    public Participation addTest(@RequestBody TestForm testForm){
        System.out.println(testForm);
        
        int score=0;
        List<Question> questions = new ArrayList<>();
        
        testForm.getReponses().forEach(  //reponses
     
            question -> questions.add(questionRepository.save(question))
        );
        questions.forEach(question -> System.out.println(question));
        
        Participation participation = new Participation();
        participation.setUsername(testForm.getUsername());
        participation.setQuestions(questions);
        
        return participationRepository.save(participation); //reponses

        
        
    } */
    @PostMapping("/addParticipation")
    public Participation addParticipation(@RequestBody TestForm testForm){
        System.out.println(testForm);
        
        int score=0;
       // List<Response> reponses = new ArrayList<>();
        List<Response> reponses = new ArrayList<>();
        testForm.getReponses().forEach(  //reponses
        		//reponseQ->questionRepository.findById(reponseQ.getId());
        			
        		//	if(reponseQ!=null){
        				reponseQ -> reponses.add(responseRepository.save(reponseQ))
        );
       
       // reponses.forEach(reponse -> System.out.println(reponse));
        
        Participation participation = new Participation();
        participation.setUsername(testForm.getUsername());
        participation.setReponses(testForm.getReponses());
        
        return participationRepository.save(participation); //reponses

        
        
    }
}
