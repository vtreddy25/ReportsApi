package com.vtr.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class InsurancePlanRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ip_id;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="plan_id")
	private InsurancePlans insurancePlan;
	
	private String status;
	
	private Date startDate;
	
	private Date lastdate;
	
	
}
