package com.society.dtos;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class GuestNotificationResponseDto {

	private Long notificationId;
	
	private String message;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public GuestNotificationResponseDto(Long notificationId, String message) {
		super();
		this.notificationId = notificationId;
		this.message = message;
	}

	public GuestNotificationResponseDto() {
		super();
	}
	
	
	
}
