package com.society.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "guards")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class SecurityGuard extends BaseEntity {

	@Column(length=50)
    private String name;
    
    @Column(name="contact_no")
    private String contactNumber;
    
    @ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SecurityGuard(String name, String contactNumber, User user) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.user = user;
	}

	public SecurityGuard() {
		super();
	}
    
}

