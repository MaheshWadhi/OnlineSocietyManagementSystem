package com.society.dtos;


import lombok.ToString;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class SocietyDto {
	
	private String name;
	
	private String address;
	
	private String contact_no;
	
	private int buildingCount;
	
	private int floorCount;
	
	private int flatCount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getBuildingCount() {
		return buildingCount;
	}

	public void setBuildingCount(int buildingCount) {
		this.buildingCount = buildingCount;
	}

	public int getFloorCount() {
		return floorCount;
	}

	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}

	public int getFlatCount() {
		return flatCount;
	}

	public void setFlatCount(int flatCount) {
		this.flatCount = flatCount;
	}

	public SocietyDto(String name, String address, String contact_no, int buildingCount, int floorCount,
			int flatCount) {
		super();
		this.name = name;
		this.address = address;
		this.contact_no = contact_no;
		this.buildingCount = buildingCount;
		this.floorCount = floorCount;
		this.flatCount = flatCount;
	}

	public SocietyDto() {
		super();
	}
	
	
	
}
