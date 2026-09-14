package com.society.dtos;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class GuestNotificationDto {
    private Long userId;
    private String guestName;
    private LocalDateTime arrivalTime;
    private String status;
    private Long securityGuardId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getSecurityGuardId() {
		return securityGuardId;
	}
	public void setSecurityGuardId(Long securityGuardId) {
		this.securityGuardId = securityGuardId;
	}
	public GuestNotificationDto(Long userId, String guestName, LocalDateTime arrivalTime, String status,
			Long securityGuardId) {
		super();
		this.userId = userId;
		this.guestName = guestName;
		this.arrivalTime = arrivalTime;
		this.status = status;
		this.securityGuardId = securityGuardId;
	}
	public GuestNotificationDto() {
		super();
	}
    
    
}
