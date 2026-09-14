package com.society.dtos;

import com.society.pojos.AvailabilityStatus;

//@Getter
//@Setter
public class ResourceResponseDto extends BaseDto {

    private String resourceType;

    private String description;
    
    private AvailabilityStatus status;
    
    private int capacity;
    
    private double bookingFee;

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AvailabilityStatus getStatus() {
		return status;
	}

	public void setStatus(AvailabilityStatus status) {
		this.status = status;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getBookingFee() {
		return bookingFee;
	}

	public void setBookingFee(double bookingFee) {
		this.bookingFee = bookingFee;
	}
    
    
    
}
