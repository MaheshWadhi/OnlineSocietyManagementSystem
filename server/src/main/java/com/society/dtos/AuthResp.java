package com.society.dtos;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class AuthResp {
	
	private String message;
	private String jwt;
	
	public AuthResp(String message, String jwt) {
		super();
		this.message = message;
		this.jwt = jwt;
	}
	
	public AuthResp() {
		super();
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}	
}
