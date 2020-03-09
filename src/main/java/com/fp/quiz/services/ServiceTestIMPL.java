package com.fp.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fp.quiz.dao.TestRepository;
import com.fp.quiz.entities.Participation;



@Service(value = "participationService")
public class ServiceTestIMPL implements TestService {
	@Autowired
	private TestRepository participationRepository;
	
	
	@Override
	public void addParticipation(Participation participation) {
		participationRepository.save(participation);
		
	}

	@Override
	public List<Participation> findAll() {
		// TODO Auto-generated method stub
		return participationRepository.findAll();
	}
}
