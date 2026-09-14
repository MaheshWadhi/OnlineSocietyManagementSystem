package com.society.pojos;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Table(name = "guest_notifications")
public class GuestNotification extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "member_id")
    private User member; // The member receiving the guest

    @Column(name = "guest_name", length = 50)
    private String guestName;

    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private NotificationStatus status; // PENDING, APPROVED, REJECTED

    @ManyToOne
    @JoinColumn(name = "security_guard_id")
    private SecurityGuard securityGuard;

	public User getMember() {
		return member;
	}

	public void setMember(User member) {
		this.member = member;
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

	public NotificationStatus getStatus() {
		return status;
	}

	public void setStatus(NotificationStatus status) {
		this.status = status;
	}

	public SecurityGuard getSecurityGuard() {
		return securityGuard;
	}

	public void setSecurityGuard(SecurityGuard securityGuard) {
		this.securityGuard = securityGuard;
	}

	public GuestNotification(User member, String guestName, LocalDateTime arrivalTime, NotificationStatus status,
			SecurityGuard securityGuard) {
		super();
		this.member = member;
		this.guestName = guestName;
		this.arrivalTime = arrivalTime;
		this.status = status;
		this.securityGuard = securityGuard;
	}

	public GuestNotification() {
		super();
	}
    
}
