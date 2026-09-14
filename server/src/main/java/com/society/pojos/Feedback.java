package com.society.pojos;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name="feedback")
public class Feedback extends BaseEntity{

	private String content;

	public Feedback(String content) {
		super();
		this.content = content;
	}
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Feedback(String content, User user) {
		super();
		this.content = content;
		this.user = user;
	}

	public Feedback() {
		super();
	}
	
}
