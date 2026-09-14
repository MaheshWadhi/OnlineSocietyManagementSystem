package com.society.dtos;


import com.society.pojos.UserRole;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class ProfileDto extends BaseDto {
	
	private String firstName;
	
	private String lastName;
	
	private String email;


	private String building;
	
	private int flatNo;
	
	private int floor;
	
	UserRole role;
	
	private String  aadhar;

	private String phone;

	private int familyCount;
//	private Long societyId;

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

	public ProfileDto(String firstName, String lastName, String email, String building, int flatNo, int floor,
			UserRole role, String aadhar, String phone, int familyCount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.building = building;
		this.flatNo = flatNo;
		this.floor = floor;
		this.role = role;
		this.aadhar = aadhar;
		this.phone = phone;
		this.familyCount = familyCount;
	}

	public ProfileDto() {
		super();
	}

	


}
