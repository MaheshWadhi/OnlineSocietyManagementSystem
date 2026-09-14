package com.society.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.society.pojos.ComplaintStatus;
import com.society.pojos.Complaints;

import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class ComplaintResDto {
	private Long id;
    private String title;
    private String description;
    private ComplaintStatus status;
    private String userName; // Make sure this is included
    private LocalDate creationDate;
    
    public ComplaintResDto(Complaints complaint) {
        this.id = complaint.getId();
        this.title = complaint.getTitle();
        this.description = complaint.getDescription();
        this.status = complaint.getStatus();
        this.userName = complaint.getUser() != null 
                ? complaint.getUser().getFirstName() + " " + complaint.getUser().getLastName() : "Unknown" ;
        this.creationDate = complaint.getCreatedOn();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public ComplaintResDto(Long id, String title, String description, ComplaintStatus status, String userName,
			LocalDate creationDate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.status = status;
		this.userName = userName;
		this.creationDate = creationDate;
	}

	public ComplaintResDto() {
		super();
	}
    
    

}
