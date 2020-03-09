package com.fp.quiz.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.dao.UserRepository;
import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.Role;
import com.fp.quiz.entities.User;

@Service(value = "questionService")
public class ServiceQuestionImpl implements QuizService{
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Override
	public void addTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	
	
}
