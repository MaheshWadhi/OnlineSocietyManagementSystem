package com.society.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	
	
	@Column(unique = true, length = 50, nullable = false)
	private String email;
	
	@Column(length = 500, nullable = false)
	private String password;

	@Column(length = 25)
	private String building;

	private int flatNo;

	private int floor;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	UserRole role;

	@Column(unique = true, length = 20)
	private String aadhar;

	@Column(length = 13)
	private String phone;

	@Column(name = "family_count")
	private int familyCount;

	public User(String firstName, String lastName, String email, String password, String building, int flatNo,
			int floor, UserRole role, String aadhar, String phone, int familyCount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.building = building;
		this.flatNo = flatNo;
		this.floor = floor;
		this.role = role;
		this.aadhar = aadhar;
		this.phone = phone;
		this.familyCount = familyCount;
	}

	public User() {
		super();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getFamilyCount() {
		return familyCount;
	}

	public void setFamilyCount(int familyCount) {
		this.familyCount = familyCount;
	}
	
	

	// @ManyToOne
	// @JoinColumn(name="society_id")
	// private Society society;
}
