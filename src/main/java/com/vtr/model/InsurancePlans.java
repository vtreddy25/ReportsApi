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
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePlans {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer plan_id;
	private String plan_name;
	
	@OneToMany(mappedBy="insurancePlan")
	private Set<InsurancePlanRegistration> registeredCustomers;
}
