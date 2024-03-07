package com.ecommerce.entities;

import java.time.LocalDate;

public class InvoiceEntity {
	/**
	 * @return the ID
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
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

	/**
	 * @return the deleteBy
	 */
	public int getDeleteBy() {
		return deleteBy;
	}

	/**
	 * @param deleteBy the deleteBy to set
	 */
	public void setDeleteBy(int deleteBy) {
		this.deleteBy = deleteBy;
	}

	/**
	 * @return the deleteDate
	 */
	public LocalDate getDeleteDate() {
		return deleteDate;
	}

	/**
	 * @param deleteDate the deleteDate to set
	 */
	public void setDeleteDate(LocalDate deleteDate) {
		this.deleteDate = deleteDate;
	}

	private int ID;
	private int status;
	private int createBy;
	private LocalDate createDate;
	private int updateBy;
	private LocalDate updateDate;
	private int deleteBy;
	private LocalDate deleteDate;
}
