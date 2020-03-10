package com.fp.quiz.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fp.quiz.dao.QuestionRepository;
import com.fp.quiz.entities.Question;

@Service(value = "questionService")
public class ServiceQuestionImpl implements QuizService{
	@Autowired
	private QuestionRepository questionRepository;
	
	
	@Override
	public void addTest(Question question) {
		questionRepository.save(question);
	}

	@Override
	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	
	
}
