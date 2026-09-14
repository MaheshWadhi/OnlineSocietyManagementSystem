package com.society.dtos;

import java.time.LocalDate;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MakePaymentDto extends PaymentDto {
	private LocalDate paymentDate;
	private Long userId;
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public MakePaymentDto(LocalDate paymentDate, Long userId) {
		super();
		this.paymentDate = paymentDate;
		this.userId = userId;
	}
	public MakePaymentDto() {
		super();
	}
	
	

}
