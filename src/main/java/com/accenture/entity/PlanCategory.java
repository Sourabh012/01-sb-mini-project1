package com.accenture.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Plan_Category")
public class PlanCategory {

	    @Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="Category_ID")
		private Integer categoryId;
		
		@Column(name="Category_Name")
		private String categoryName;
		
		@Column(name="Active_SW")
		private String activeSw;
		
		@Column(name="Create_Date")
		private LocalDateTime createDate;
		
		@Column(name="Updated_Data")
		private LocalDateTime updateDate;
		
		@Column(name="Create_By")
		private String createBY;
		
		@Column(name="Update_By")
		private String updateBy;

	}


