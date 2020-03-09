package com.fp.quiz.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	public Role () {
		
	}
	public Role(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Role(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
