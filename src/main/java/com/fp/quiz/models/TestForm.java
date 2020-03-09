package com.fp.quiz.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fp.quiz.entities.Question;
import com.fp.quiz.entities.Response;


public class TestForm {
    private String username;
    private int score;
    private List<Response> reponses;
	public TestForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestForm(String username, int score, List<Response> reponses) {
		super();
		this.username = username;
		this.score = score;
		this.reponses = reponses;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
    @JsonIgnore
	public int getScore() {
		return score;
	}  
    
	public void setScore(int score) {
		this.score = score;
	}
	

	public List<Response> getReponses() {
		return reponses;
	}

	public void setReponses(List<Response> reponses) {
		this.reponses = reponses;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
 
}
