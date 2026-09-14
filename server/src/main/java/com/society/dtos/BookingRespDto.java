package com.society.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

import com.society.pojos.BookingStatus;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class BookingRespDto extends BaseDto {

	    private BookingStatus status;
	    
	    private LocalDate bookingDate;
	    
	    private LocalTime startTime;
	    
	    private LocalTime endTime;
	    
	    private String purpose;
	    
	    private String comments;
	    
	    private String resourceType;  
	    
	    private String firstName;
	    
	    private String lastName;

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

		public String getResourceType() {
			return resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public BookingRespDto(BookingStatus status, LocalDate bookingDate, LocalTime startTime, LocalTime endTime,
				String purpose, String comments, String resourceType, String firstName, String lastName) {
			super();
			this.status = status;
			this.bookingDate = bookingDate;
			this.startTime = startTime;
			this.endTime = endTime;
			this.purpose = purpose;
			this.comments = comments;
			this.resourceType = resourceType;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public BookingRespDto() {
			super();
		}
	    
	    
	   
}
