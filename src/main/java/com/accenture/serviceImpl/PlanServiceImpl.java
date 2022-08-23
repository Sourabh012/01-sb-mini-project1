package com.accenture.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.entity.Plan;
import com.accenture.repo.PlanRepo;
import com.accenture.service.PlanService;
@Service
public class PlanServiceImpl implements PlanService {
	
	@Autowired
	private PlanRepo planMasterRepo;

	@Override
	public boolean savePlan(Plan plan) {
		Plan saved = planMasterRepo.save(plan);
		return saved.getPlanId()!= null;
	}

	@Override
	public List<Plan> getAllPlans() {
		List<Plan> Plans = planMasterRepo.findAll();
		return Plans;
	}

	@Override
	public Plan getPlanById(Integer Id) {
		Optional<Plan> findById = planMasterRepo.findById(Id);
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean updatePlan(Plan plan) {
		Plan save = planMasterRepo.save(plan);
		return save.getPlanId()!=null;
	}

	@Override
	public boolean deletePlanById(Integer Id) {
		boolean status=false;
		try {
		planMasterRepo.deleteById(Id);
		status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean planStatusChange(Integer planId, String status) {
		Optional<Plan> findById = planMasterRepo.findById(planId);
		if(findById.isPresent())
		{
			Plan plan = findById.get();
			if(status.equalsIgnoreCase("y") )
			{
				status="n";
			}
			else
			{
				status="y";
			}
			plan.setActiveSw(status);
			planMasterRepo.save(plan);
			return true;
		}
		return false;
	}

	
}
