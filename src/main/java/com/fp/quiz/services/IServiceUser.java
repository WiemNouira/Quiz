package com.fp.quiz.services;

import java.util.List;

import com.fp.quiz.entities.*;

public interface IServiceUser {

	public void register(User u);
	public List<User> getAll();
	public void delete(Long id);
    public User findById(Long id);
    public User finByUsername(String username);
    public User finByEmail(String email);
    public void addUser();
}
