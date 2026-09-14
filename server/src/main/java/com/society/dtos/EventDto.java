package com.society.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.ToString;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class EventDto extends BaseDto{

	
	private String title;
	
	private String description;
	
	
	private LocalDate date;

	private Long userId;

	private String location;
	
	private LocalTime time;

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventDto(String title, String description, LocalDate date, Long userId, String location, LocalTime time) {
		super();
		this.title = title;
		this.description = description;
		this.date = date;
		this.userId = userId;
		this.location = location;
		this.time = time;
	}

	public EventDto() {
		super();
	}
	
	
}
