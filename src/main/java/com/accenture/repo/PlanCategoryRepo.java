package com.accenture.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.entity.PlanCategory;
@Repository
public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer>{

}
