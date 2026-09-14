package com.society.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.society.pojos.ComplaintStatus;
import com.society.pojos.Complaints;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class ComplaintByIdDto {
	private Long id;
	private LocalDate createdOn;
	private LocalDateTime updatedOn;
	private String title;
	private String description;
	private ComplaintStatus status;
	private LocalDateTime creationDate;

	public ComplaintByIdDto(Complaints complaint) {
	    this.id = complaint.getId();  // Set ID
	    this.createdOn = complaint.getCreatedOn();  // Set createdOn
	    this.updatedOn = complaint.getUpdatedOn();  // Set updatedOn
	    this.title = complaint.getTitle();
	    this.description = complaint.getDescription();
	    this.status = complaint.getStatus();
	    this.creationDate = complaint.getUpdatedOn();    
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public ComplaintByIdDto(Long id, LocalDate createdOn, LocalDateTime updatedOn, String title, String description,
			ComplaintStatus status, LocalDateTime creationDate) {
		super();
		this.id = id;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.title = title;
		this.description = description;
		this.status = status;
		this.creationDate = creationDate;
	}

	public ComplaintByIdDto() {
		super();
	}
	
	
}
