package com.society.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class BookingDto {
	
	    private LocalDate bookingDate;
	    
	    private LocalTime startTime;
	    
	    private LocalTime endTime;
	    
	    private String purpose;
	    
	    private String comments;
	    
	    private Long resourceId;

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

		public Long getResourceId() {
			return resourceId;
		}

		public void setResourceId(Long resourceId) {
			this.resourceId = resourceId;
		}

		public BookingDto(LocalDate bookingDate, LocalTime startTime, LocalTime endTime, String purpose,
				String comments, Long resourceId) {
			super();
			this.bookingDate = bookingDate;
			this.startTime = startTime;
			this.endTime = endTime;
			this.purpose = purpose;
			this.comments = comments;
			this.resourceId = resourceId;
		}

		public BookingDto() {
			super();
		}
	    
}
