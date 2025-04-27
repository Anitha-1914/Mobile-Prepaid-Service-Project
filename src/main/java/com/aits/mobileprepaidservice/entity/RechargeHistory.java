package com.aits.mobileprepaidservice.entity;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RechargeHistory {

	@JsonIgnore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private User user;
	@ManyToOne
	private RechargePlan plan;
	private String paymentMethod;
	private LocalDateTime rechargeDate;
	public RechargeHistory(Long id,User user,RechargePlan plan,String paymentMethod, LocalDateTime rechargeDate) {
		super();
		this.id=id;
		this.user=user;
		this.plan=plan;
		this.paymentMethod=paymentMethod;
		this.rechargeDate=rechargeDate;
	}
	public RechargeHistory() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getRechargeData() {
		return rechargeDate;
	}
	public void setRechargeData(LocalDateTime rechargeData) {
		this.rechargeDate = rechargeData;
	}
	public User getUser() {
		return user;
	}
	public RechargePlan getPlan() {
		return plan;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setUser(User user2) {
		// TODO Auto-generated method stub
		
	}
	public void setPlan(RechargePlan rechargePlan) {
		// TODO Auto-generated method stub
		
	}
	public void setPaymentMethod(String paymentMethod2) {
		// TODO Auto-generated method stub
		
	}
	public void setRechargeDate(LocalDateTime now) {
		// TODO Auto-generated method stub
		
	}
}
