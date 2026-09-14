package com.society.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "society")
public class Society extends BaseEntity {

	@Column(length = 25)
	private String name;

	@Column(length = 50)
	private String address;

	@Column(length = 10)
	private String contact_no;

	@Column(name = "building_count")
	private int buildingCount;

	@Column(name = "floor_count")
	private int floorCount;

	@Column(name = "flat_count")
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

	public Society(String name, String address, String contact_no, int buildingCount, int floorCount, int flatCount) {
		super();
		this.name = name;
		this.address = address;
		this.contact_no = contact_no;
		this.buildingCount = buildingCount;
		this.floorCount = floorCount;
		this.flatCount = flatCount;
	}

	public Society() {
		super();
	}
	

//	@OneToMany(mappedBy = "society", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<User> users = new ArrayList<>();
	

}
