package com.vtr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vtr.model.InsurancePlanRegistration;

public interface InsurancePlanRegistrationRepo 
                extends JpaRepository<InsurancePlanRegistration,Integer> {
	
	List<InsurancePlanRegistration> findByPlan_nameAndStatus(String plan_name,String status);

}
