package com.society.pojos;

import java.time.LocalDate;
import java.time.LocalTime;

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
@Table(name="bookings")
public class Bookings extends BaseEntity {
    
    @Enumerated(EnumType.STRING)
    @Column(length=15)
    private BookingStatus status;
    
    @Column()
    private LocalDate bookingDate;
    
    @Column(name="start_time")
    private LocalTime startTime;
    
    @Column(name="end_time")
    private LocalTime endTime;
    
    @Column(length=50)
    private String purpose;
    
    @Column(length=255)
    private String comments; // Optional field for additional notes
    
    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resources resource;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Resources getResource() {
		return resource;
	}

	public void setResource(Resources resource) {
		this.resource = resource;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bookings(BookingStatus status, LocalDate bookingDate, LocalTime startTime, LocalTime endTime, String purpose,
			String comments, Resources resource, User user) {
		super();
		this.status = status;
		this.bookingDate = bookingDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.purpose = purpose;
		this.comments = comments;
		this.resource = resource;
		this.user = user;
	}

	public Bookings() {
		super();
	} 

}

