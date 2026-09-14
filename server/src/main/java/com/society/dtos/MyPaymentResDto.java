package com.society.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class MyPaymentResDto {
	
	   private BigDecimal amount;
	   private String paymentType;
	   private LocalDate paymentDate;
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public MyPaymentResDto(BigDecimal amount, String paymentType, LocalDate paymentDate) {
		super();
		this.amount = amount;
		this.paymentType = paymentType;
		this.paymentDate = paymentDate;
	}
	public MyPaymentResDto() {
		super();
	}
	    
	   
}
