package com.ecommerce.entities;

import java.time.LocalDate;

public class ProductCategoryEntity {
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getCreateBy() {
		return createBy;
	}
	
	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}
	
	public LocalDate getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
	public int getUpdateBy() {
		return updateBy;
	}
	
	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}
	
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	

	private int ID;
	private String name;
	private boolean status;
	private int createBy;
	private LocalDate createDate;
	private int updateBy;
	private LocalDate updateDate;
}
