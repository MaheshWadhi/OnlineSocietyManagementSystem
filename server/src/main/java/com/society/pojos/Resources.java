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
@Table(name="resources")
public class Resources extends BaseEntity{

    @Column(length=25)
    private String resourceType;

    @Column(length=500)
    private String description;
    
    @Enumerated(EnumType.STRING)
    private AvailabilityStatus status = AvailabilityStatus.AVAILABLE; 
    
    private int capacity;
    
    private double bookingFee;
      
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Resources(String resourceType, String description, AvailabilityStatus status, int capacity,
			double bookingFee, User user) {
		super();
		this.resourceType = resourceType;
		this.description = description;
		this.status = status;
		this.capacity = capacity;
		this.bookingFee = bookingFee;
		this.user = user;
	}

	public Resources() {
		super();
	}
    
//    @ManyToOne
//    @JoinColumn(name = "society_id")
//    private Society society;
    
    
}
