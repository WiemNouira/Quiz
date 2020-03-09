package com.fp.quiz.utils;

public class AuthToken {
   private String token;

   public AuthToken() {
	  super();
	// TODO Auto-generated constructor stub
   }
   public AuthToken(String token){
       this.token = token;
   }

   public String getToken() {
	return token;
   }

  public void setToken(String token) {
	 this.token = token;
  }

  @Override
  public String toString() {
	 // TODO Auto-generated method stub
	 return super.toString();
  }
  
   
   
  

}
