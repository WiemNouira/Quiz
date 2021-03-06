package com.fp.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fp.quiz.entities.Participation;


@CrossOrigin("*")
@RepositoryRestResource
@Repository("participationRepository")
public interface TestRepository extends JpaRepository<Participation, Long> {
	
}
