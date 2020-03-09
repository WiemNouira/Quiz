package com.fp.quiz.services;

import java.util.List;

import com.fp.quiz.entities.Participation;
import com.fp.quiz.entities.Question;

public interface TestService {
	  public void addParticipation(Participation participation);
	  public List<Participation> findAll();

}
