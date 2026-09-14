package com.society.dtos;

import com.society.pojos.ComplaintStatus;

import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
@ToString

public class ComplaintDto extends BaseDto{
  
	private String title;
	
	private String description;
	
	private ComplaintStatus status;
    
	private Long userId;
	

	public ComplaintDto(String title, String description, ComplaintStatus status, Long userId) {
		super();
		this.title = title;
		this.description = description;
		this.status = status;
		this.userId = userId;
	}


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


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public ComplaintDto() {
		super();
	}
	

}
