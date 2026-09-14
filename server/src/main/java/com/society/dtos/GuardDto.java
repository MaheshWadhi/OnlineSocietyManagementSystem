package com.society.dtos;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class GuardDto {
	
    private String name;
    
    private String contactNumber;

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

	public GuardDto(String name, String contactNumber) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public GuardDto() {
		super();
	}

    
    
}
