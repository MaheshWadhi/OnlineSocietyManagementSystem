package com.society.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.society.pojos.PaymentStatus;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class PaymentResDto extends BaseDto{

	    private BigDecimal amount;
	    private String paymentType;
	    private LocalDate dueDate;
	    private LocalDate paymentDate;
	    private PaymentStatus status;
	    private String firstName;
	    private String lastName;
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
		public LocalDate getPaymentDate() {
			return paymentDate;
		}
		public void setPaymentDate(LocalDate paymentDate) {
			this.paymentDate = paymentDate;
		}
		public PaymentStatus getStatus() {
			return status;
		}
		public void setStatus(PaymentStatus status) {
			this.status = status;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public PaymentResDto(BigDecimal amount, String paymentType, LocalDate dueDate, LocalDate paymentDate,
				PaymentStatus status, String firstName, String lastName) {
			super();
			this.amount = amount;
			this.paymentType = paymentType;
			this.dueDate = dueDate;
			this.paymentDate = paymentDate;
			this.status = status;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public PaymentResDto() {
			super();
		}
	    
	    
}
