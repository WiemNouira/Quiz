package com.fp.quiz.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

import com.fp.quiz.entities.Question;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class TestForm {
    private String username;
    private int score;
    private List<Question> questions;
	public TestForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestForm(String username, int score , List<Question> questions) {
		super();
		this.username = username;
		this.score = score;
		this.questions = questions;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

    
    
}
