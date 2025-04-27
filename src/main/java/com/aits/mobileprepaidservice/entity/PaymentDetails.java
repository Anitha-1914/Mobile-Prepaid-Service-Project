package com.aits.mobileprepaidservice.entity;
import lombok.Data;
@Data
public class PaymentDetails {
 private String method;
 private String UpiId;
 private String cardnumber;
 private String bankAccount;
public PaymentDetails(String method,String UpiId,String cardnumber,String bankAccount) {
	 this.method=method;
	 this.UpiId=UpiId;
	 this.cardnumber=cardnumber;
	 this.bankAccount=bankAccount;
 }
 public PaymentDetails() {
	 
 }
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
public String getUpiId() {
	return UpiId;
}
public void setUpiId(String upiId) {
	UpiId = upiId;
}
public String getCardnumber() {
	return cardnumber;
}
public void setCardnumber(String cardnumber) {
	this.cardnumber = cardnumber;
}
public String getBankAccount() {
	return bankAccount;
}
public void setBankAccount(String bankAccount) {
	this.bankAccount = bankAccount;
}
}
