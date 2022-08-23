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

		public Integer getPlanId() {
			return planId;
		}

		public void setPlanId(Integer planId) {
			this.planId = planId;
		}

		public String getPlanName() {
			return planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public Date getPlanStartDate() {
			return planStartDate;
		}

		public void setPlanStartDate(Date planStartDate) {
			this.planStartDate = planStartDate;
		}

		public Date getPlanEndDate() {
			return planEndDate;
		}

		public void setPlanEndDate(Date planEndDate) {
			this.planEndDate = planEndDate;
		}

		public int getPlanCategoryId() {
			return planCategoryId;
		}

		public void setPlanCategoryId(int planCategoryId) {
			this.planCategoryId = planCategoryId;
		}

		public String getActiveSw() {
			return activeSw;
		}

		public void setActiveSw(String activeSw) {
			this.activeSw = activeSw;
		}

		public LocalDateTime getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}

		public LocalDateTime getUpdateDate() {
			return updateDate;
		}

		public void setUpdateDate(LocalDateTime updateDate) {
			this.updateDate = updateDate;
		}

		public String getCreateBY() {
			return createBY;
		}

		public void setCreateBY(String createBY) {
			this.createBY = createBY;
		}

		public String getUpdateBy() {
			return updateBy;
		}

		public void setUpdateBy(String updateBy) {
			this.updateBy = updateBy;
		}

		@Override
		public String toString() {
			return "Plan_Master [planId=" + planId + ", planName=" + planName + ", planStartDate=" + planStartDate
					+ ", planEndDate=" + planEndDate + ", planCategoryId=" + planCategoryId + ", activeSw=" + activeSw
					+ ", createDate=" + createDate + ", updateDate=" + updateDate + ", createBY=" + createBY
					+ ", updateBy=" + updateBy + "]";
		}

		public Plan() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Plan(Integer planId, String planName, Date planStartDate, Date planEndDate, int planCategoryId,
				String activeSw, LocalDateTime createDate, LocalDateTime updateDate, String createBY, String updateBy) {
			super();
			this.planId = planId;
			this.planName = planName;
			this.planStartDate = planStartDate;
			this.planEndDate = planEndDate;
			this.planCategoryId = planCategoryId;
			this.activeSw = activeSw;
			this.createDate = createDate;
			this.updateDate = updateDate;
			this.createBY = createBY;
			this.updateBy = updateBy;
		}
		
		

}
