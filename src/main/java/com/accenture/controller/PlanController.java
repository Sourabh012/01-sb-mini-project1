package com.accenture.controller;

import java.util.List;
import java.util.Map;

import org.apache.catalina.authenticator.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.constants.AppConstants;
import com.accenture.entity.Plan;
import com.accenture.props.AppProperties;
import com.accenture.service.PlanService;

@RestController
public class PlanController {
    
	private PlanService planService;
	
	private Map<String, String> message;
	
	public PlanController(PlanService planServive,AppProperties appProp) 
	{
		this.planService = planServive;
		this.message = appProp.getMessages();
		
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<String> save(@RequestBody Plan plan){
		
		String responsemsg=AppConstants.EMPTY_STR;
		
		boolean savePlan = planService.savePlan(plan);
		
		if(savePlan)
		{
			responsemsg=message.get(AppConstants.PLAN_SAVE_SUCC);
		}
		else
		{
			responsemsg=message.get(AppConstants.PLAN_SAVE_FAIL);
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/alldetails")
	public ResponseEntity<List<Plan>> getAllDetails()
	{
		List<Plan> allPlans = planService.getAllPlans();
		return new ResponseEntity<>(allPlans,HttpStatus.OK);
	}
	
	@GetMapping(value="/details/{id}")
	public ResponseEntity<Plan> getDetailsById(@PathVariable("id") Integer Id)
	{
		Plan planById = planService.getPlanById(Id);
		return new ResponseEntity<>(planById,HttpStatus.OK);
	}
	
	@GetMapping(value="/edit/{id}")
	public ResponseEntity<Plan> edit(@PathVariable("id") Integer Id)
	{
		Plan planById = planService.getPlanById(Id);
		return new ResponseEntity<>(planById,HttpStatus.OK);
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<String> update(@RequestBody Plan plan)
	{
		String responsemsg="";
		boolean savePlan = planService.savePlan(plan);
		if(savePlan)
		{
			responsemsg=message.get(AppConstants.PLAN_UPDATE_SUCC);
		}
		else
		{
			responsemsg=message.get(AppConstants.PLAN_UPDATE_FAIL);
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer Id)
	{
		String responemsg="";
		boolean deletePlanById = planService.deletePlanById(Id);
		if(deletePlanById)
		{
			responemsg=message.get(AppConstants.PLAN_DELETE_SUCC);
		}
		else
		{
			responemsg=message.get(AppConstants.PLAN_DELETE_FAIL);
		}
		return new ResponseEntity<>(responemsg,HttpStatus.OK);	
	}
	
	@PutMapping(value="/status/{id}/{status}")
	public ResponseEntity<String> statusChange(@PathVariable("id") Integer Id,@PathVariable("status") String status)
	{
		String responsemsg="";
		boolean planStatusChange = planService.planStatusChange(Id, status);
		if(planStatusChange)
		{
			responsemsg=message.get(AppConstants.PLAN_STATUS_SUCC);
		}
		else
		{
			responsemsg=message.get(AppConstants.PLAN_STATUS_FAIL);
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.OK);
	}
}
