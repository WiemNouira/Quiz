package com.fp.quiz.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.User;
import com.fp.quiz.services.IServiceUser;
import com.fp.quiz.services.QuizService;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	@Autowired
    private IServiceUser userService;
	
	@Autowired
    private QuizService quizService;
	
    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PreAuthorize("hasRole('USER')")
    @GetMapping(value="/users")
    public List<User> listUser(){
        return userService.getAll();
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping(value="/questions")
    public List<Question> findAll(){
		return quizService.findAll();
    	
    }

  
}
