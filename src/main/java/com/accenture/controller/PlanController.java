package com.accenture.controller;

import java.util.List;

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

import com.accenture.entity.Plan;
import com.accenture.service.PlanService;

@RestController
public class PlanController {
    
	@Autowired
	private PlanService planMasterService;
	
	@PostMapping(value="/save")
	public ResponseEntity<String> save(@RequestBody Plan plan){
		
		String responsemsg="";
		
		boolean savePlan = planMasterService.savePlan(plan);
		
		if(savePlan)
		{
			responsemsg="Record Saved";
		}
		else
		{
			responsemsg="Sorry Not Able to Store Data";
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value="/alldetails")
	public ResponseEntity<List<Plan>> getAllDetails()
	{
		List<Plan> allPlans = planMasterService.getAllPlans();
		return new ResponseEntity<>(allPlans,HttpStatus.OK);
	}
	
	@GetMapping(value="/details/{id}")
	public ResponseEntity<Plan> getDetailsById(@PathVariable("id") Integer Id)
	{
		Plan planById = planMasterService.getPlanById(Id);
		return new ResponseEntity<>(planById,HttpStatus.OK);
	}
	
	@GetMapping(value="/edit/{id}")
	public ResponseEntity<Plan> edit(@PathVariable("id") Integer Id)
	{
		Plan planById = planMasterService.getPlanById(Id);
		return new ResponseEntity<>(planById,HttpStatus.OK);
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<String> update(@RequestBody Plan plan)
	{
		String responsemsg="";
		boolean savePlan = planMasterService.savePlan(plan);
		if(savePlan)
		{
			responsemsg="Record Updated";
		}
		else
		{
			responsemsg="Unable to Update Record";
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer Id)
	{
		String responemsg="";
		boolean deletePlanById = planMasterService.deletePlanById(Id);
		if(deletePlanById)
		{
			responemsg="Record Deleted";
		}
		else
		{
			responemsg="Unable to Delete the record";
		}
		return new ResponseEntity<>(responemsg,HttpStatus.OK);	
	}
	
	@PutMapping(value="/status/{id}/{status}")
	public ResponseEntity<String> statusChange(@PathVariable("id") Integer Id,@PathVariable("status") String status)
	{
		String responsemsg="";
		boolean planStatusChange = planMasterService.planStatusChange(Id, status);
		if(planStatusChange)
		{
			responsemsg="Record Updated";
		}
		else
		{
			responsemsg="Unable to Update Record";
		}
		return new ResponseEntity<>(responsemsg,HttpStatus.OK);
	}
}
