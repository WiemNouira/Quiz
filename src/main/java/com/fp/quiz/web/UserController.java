package com.fp.quiz.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.dao.TestRepository;
import com.fp.quiz.entities.Participation;
import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.User;
import com.fp.quiz.models.TestForm;
import com.fp.quiz.services.IServiceUser;
import com.fp.quiz.services.QuizService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
	@Autowired
    private IServiceUser userService;
	@Autowired
    private QuizService quizService;
	 @Autowired
	private QuestionRepository questionRepository;
	 @Autowired
	    
	 private TestRepository participationRepository;
	 
	
    @PreAuthorize("hasRole('USER')")
    @GetMapping(value="/questions")
    public List<Question> findAll(){
		return quizService.findAll();
    	
    }
    
    @PreAuthorize("hasRole('USER')")
    @PostMapping(value="/addParticipation")
    public ResponseEntity<String> addParticipation(@RequestBody TestForm testForm){
        System.out.println(testForm);
        
        int score=0;

        ArrayList<String> reponses = testForm.getReponses();
    
              
        Participation participation = new Participation();
        participation.setUsername(testForm.getUsername());
        participation.setReponses(testForm.getReponses());
        
        for(int i = 0 ; i <=9; i++)  
        	
        {   String repU = reponses.get(i);
        	System.out.println(reponses.get(i)); 
        	 Optional<Question> question = questionRepository.findById(Long.valueOf(i));
        	String repT = question.get().getReponse();
        	 System.out.println(question.get().getReponse());
        	 if(repU.equals(repT)) {
        		 score+=3;
        	 }
        	 else {
        		 score-=1;
        	 }
 
        }
        participation.setScore(score);
       System.out.println("Votre Score est:"+score);
       participationRepository.save(participation);
       return new ResponseEntity<>(testForm.getUsername()+
    		      " Your Score is " + score+"!"
    		      ,    HttpStatus.OK);   
        
    }
    

  
}
