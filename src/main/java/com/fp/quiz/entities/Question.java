package com.fp.quiz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Question {
    @Id
 
    private Long id;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String reponse;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(Long id, String question, String reponse) {
		super();
		this.id = id;
		this.question = question;
		this.reponse = reponse;
	}

	public Question(Long id, String question, String option1, String option2, String option3, String option4,
			String reponse) {
		super();
		this.id = id;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.reponse = reponse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
  @JsonIgnore
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


}
