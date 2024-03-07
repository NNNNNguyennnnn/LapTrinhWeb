package com.ecommerce.entities;

import java.time.LocalDate;

public class ProductEntity {
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the promotionPrice
	 */
	public int getPromotionPrice() {
		return promotionPrice;
	}

	/**
	 * @param promotionPrice the promotionPrice to set
	 */
	public void setPromotionPrice(int promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	/**
	 * @return the vAT
	 */
	public boolean isVAT() {
		return VAT;
	}

	/**
	 * @param vAT the vAT to set
	 */
	public void setVAT(boolean VAT) {
		this.VAT = VAT;
	}

	/**
	 * @return the warranty
	 */
	public int getWarranty() {
		return warranty;
	}

	/**
	 * @param warranty the warranty to set
	 */
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	/**
	 * @return the decription
	 */
	public String getDecription() {
		return decription;
	}

	/**
	 * @param decription the decription to set
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}

	/**
	 * @return the detail
	 */
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the viewCount
	 */
	public int getViewCount() {
		return viewCount;
	}

	/**
	 * @param viewCount the viewCount to set
	 */
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * @return the categoryID
	 */
	public int getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @return the brandID
	 */
	public int getBrandID() {
		return brandID;
	}

	/**
	 * @param brandID the brandID to set
	 */
	public void setBrandID(int brandID) {
		this.brandID = brandID;
	}

	/**
	 * @return the supplierID
	 */
	public int getSupplierID() {
		return supplierID;
	}

	/**
	 * @param supplierID the supplierID to set
	 */
	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	/**
	 * @return the createBy
	 */
	public int getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the createDate
	 */
	public LocalDate getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the updateBy
	 */
	public int getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(int updateBy) {
		this.updateBy = updateBy;
	}

	/**
	 * @return the updateDate
	 */
	public LocalDate getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	private int ID;
	private String name;
	private boolean status;
	private int price;
	private int promotionPrice;
	private boolean VAT;
	private int warranty;
	private String decription;
	private String detail;
	private int viewCount;
	private int categoryID;
	private int brandID;
	private int supplierID;
	private int createBy;
	private LocalDate createDate;
	private int updateBy;
	private LocalDate updateDate;
}
