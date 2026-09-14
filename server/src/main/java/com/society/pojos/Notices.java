package com.society.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name="notices")
public class Notices extends BaseEntity {
	
	@Column(length=50)
	private String title;
	
	@Column(length=100)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Notices(String title, String description, User user) {
		super();
		this.title = title;
		this.description = description;
		this.user = user;
	}

	public Notices() {
		super();
	}
	
}
