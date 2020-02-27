package com.fp.quiz.entities;
import lombok.Data;
import javax.persistence.*;

import com.fp.quiz.entities.Question;

import java.util.List;

@Entity
@Data
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Question> questions;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(Long id, String username, List<Question> questions) {
		super();
		this.id = id;
		this.username = username;;
		this.questions = questions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
}
