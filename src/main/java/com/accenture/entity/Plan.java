package com.accenture.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name="Plan_Master")
public class Plan {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="Plan_Id")
		private Integer planId;
		
		@Column(name="Plan_Name")
		private String planName;
		
		 @JsonFormat(pattern = "yyyy/MM/dd")
		private Date planStartDate;
		
		 @JsonFormat(pattern = "yyyy/MM/dd")
		private Date planEndDate;
		
		@Column(name="Plan_Category_Id")
		private int planCategoryId;
		
		@Column(name="Active_SW")
		private String activeSw;
		
		@Column(name="Create_Date",updatable = false)
		@CreationTimestamp
		private LocalDateTime createDate;
		
		@Column(name="Updated_Data",insertable = false)
		@UpdateTimestamp
		private LocalDateTime updateDate;
		
		@Column(name="Create_By")
		private String createBY;
		
		@Column(name="Update_By")
		private String updateBy;	

}
