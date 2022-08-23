package com.accenture.service;

import java.util.List;

import com.accenture.entity.Plan;

public interface PlanService {
	
	public boolean savePlan(Plan plan);
	
	public List<Plan> getAllPlans();
	
	public Plan getPlanById(Integer Id);
	
	public boolean updatePlan(Plan plan);
	
	public boolean deletePlanById(Integer Id);
	
	public boolean planStatusChange(Integer planId,String status);
	
	
	
	

}
