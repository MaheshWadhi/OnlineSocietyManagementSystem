package com.society.dtos;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MemberRespDto extends BaseDto {
	
	
	private String firstName;

	private String lastName;
	
	private String email;
	
	private String building;

	private int flatNo;

	private int floor;

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

	public MemberRespDto(String firstName, String lastName, String email, String building, int flatNo, int floor) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.building = building;
		this.flatNo = flatNo;
		this.floor = floor;
	}

	public MemberRespDto() {
		super();
	}
	
	
	
}