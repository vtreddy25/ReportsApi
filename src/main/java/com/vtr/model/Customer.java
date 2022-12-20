package com.vtr.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cust_id;
	private String cust_name;
	private String email;
	private Long phno;
	private String gender;
	
	@OneToMany(mappedBy="customer")
	private Set<InsurancePlanRegistration> registeredPlans;
	
	
	
}
