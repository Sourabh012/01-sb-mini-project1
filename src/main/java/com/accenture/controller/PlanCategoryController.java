package com.accenture.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.service.PlanCategoryService;

@RestController
public class PlanCategoryController {
	
	@Autowired
	PlanCategoryService planCategoryService;
	
	@GetMapping(value="/category")
	public ResponseEntity<Map<Integer, String>> allcategory()
	{
		Map<Integer, String> dropDownCategory = planCategoryService.dropDownCategory();
		return new ResponseEntity<>(dropDownCategory,HttpStatus.OK);
	}

}
