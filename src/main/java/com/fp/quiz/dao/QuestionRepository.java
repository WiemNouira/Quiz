package com.fp.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fp.quiz.entities.Question;

@CrossOrigin("*")
@RepositoryRestResource
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
