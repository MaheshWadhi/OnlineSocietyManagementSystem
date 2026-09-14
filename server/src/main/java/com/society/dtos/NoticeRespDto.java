package com.society.dtos;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class NoticeRespDto extends BaseDto{

	private String title;

	private String description;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public NoticeRespDto(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public NoticeRespDto() {
		super();
	}
	

}
