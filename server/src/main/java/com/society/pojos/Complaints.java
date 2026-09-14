package com.society.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name="complaints")
public class Complaints extends BaseEntity{
	
	
	@Column(length=40)
	private String title;
	
	@Column(length=50)
	private String description;
	
	@Enumerated(EnumType.STRING)  
	private ComplaintStatus status;
	
	@Enumerated(EnumType.STRING)  
	private ActivityStatus activityStatus;
	

	public Complaints(String title, String description, ComplaintStatus status, ActivityStatus activityStatus,
			User user) {
		super();
		this.title = title;
		this.description = description;
		this.status = status;
		this.activityStatus = ActivityStatus.ACTIVE;
		this.user = user;
	}


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


	public ComplaintStatus getStatus() {
		return status;
	}


	public void setStatus(ComplaintStatus status) {
		this.status = status;
	}


	public ActivityStatus getActivityStatus() {
		return activityStatus;
	}


	public void setActivityStatus(ActivityStatus activityStatus) {
		this.activityStatus = activityStatus;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Complaints() {
		super();
	}
	
	
	
	
	
}
