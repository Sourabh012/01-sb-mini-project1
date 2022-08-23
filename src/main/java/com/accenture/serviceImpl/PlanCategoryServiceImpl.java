package com.accenture.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.entity.PlanCategory;
import com.accenture.repo.PlanCategoryRepo;
import com.accenture.service.PlanCategoryService;

@Service
public class PlanCategoryServiceImpl implements PlanCategoryService {

	@Autowired
	private PlanCategoryRepo planCategoryRepo;
	
	@Override
	public Map<Integer, String> dropDownCategory() {
		Map<Integer,String> categories = new HashMap<>();
		List<PlanCategory> findAll = planCategoryRepo.findAll();
		findAll.forEach(category -> { categories.put(category.getCategoryId(), category.getCategoryName());
		});
		return categories;
	}

	
}
