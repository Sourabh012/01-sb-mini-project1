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

		public Integer getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Integer categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
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

		public PlanCategory() {
			super();
			// TODO Auto-generated constructor stub
		}

		public PlanCategory(Integer categoryId, String categoryName, String activeSw, LocalDateTime createDate,
				LocalDateTime updateDate, String createBY, String updateBy) {
			super();
			this.categoryId = categoryId;
			this.categoryName = categoryName;
			this.activeSw = activeSw;
			this.createDate = createDate;
			this.updateDate = updateDate;
			this.createBY = createBY;
			this.updateBy = updateBy;
		}

		@Override
		public String toString() {
			return "Plan_Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", activeSw="
					+ activeSw + ", createDate=" + createDate + ", updateDate=" + updateDate + ", createBY=" + createBY
					+ ", updateBy=" + updateBy + "]";
		}
		
		

	}


