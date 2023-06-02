package com.quizgram.quizgrambackend.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class LoginResponse {
   
	private User user;
    private String jwtToken;
    
	public LoginResponse(User user, String jwtToken) {
		super();
		this.user = user;
		this.jwtToken = jwtToken;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
    
    
}
