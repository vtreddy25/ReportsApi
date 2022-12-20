package com.vtr.service;

import java.util.List;

import com.vtr.model.InsurancePlanRegistration;

public interface ReportsService {

	public List<InsurancePlanRegistration> getReport(String plan_name,String status);
}
