package com.society.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.ToString;


//@NoArgsConstructor
@ToString
//@Getter
//@Setter
//@AllArgsConstructor

public class PaymentDto{
	
	    private BigDecimal amount;
	    private String paymentType;
	    private LocalDate dueDate;
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
		public LocalDate getDueDate() {
			return dueDate;
		}
		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}
		public PaymentDto(BigDecimal amount, String paymentType, LocalDate dueDate) {
			super();
			this.amount = amount;
			this.paymentType = paymentType;
			this.dueDate = dueDate;
		}
		public PaymentDto() {
			super();
		}
	    
	    
	        
}
