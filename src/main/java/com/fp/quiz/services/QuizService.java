package com.fp.quiz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fp.quiz.entities.Question;


public interface QuizService {
    public void addTest();
    public List<Question> findAll();
}
