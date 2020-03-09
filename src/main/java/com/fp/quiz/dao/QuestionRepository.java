package com.fp.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fp.quiz.entities.Question;

@CrossOrigin("*")
@RepositoryRestResource
@Repository("questionRepository")
public interface QuestionRepository extends JpaRepository<Question, Long> {
	Optional<Question> findById(Long id);
	Optional<Question> findByQuestion(String question);
    List<Question> findAll();
    
	 
}
