package com.fp.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fp.quiz.entities.Test;
@CrossOrigin("*")
@RepositoryRestResource
public interface TestRepository extends JpaRepository<Test, Long> {
}
