package com.ecommerce.entities;

import java.time.LocalDate;

public class OrderEntity {
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
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
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
	 * @return the delivered
	 */
	public boolean isDelivered() {
		return delivered;
	}
	/**
	 * @param delivered the delivered to set
	 */
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	/**
	 * @return the deliveredDate
	 */
	public LocalDate getDeliveredDate() {
		return deliveredDate;
	}
	/**
	 * @param deliveredDate the deliveredDate to set
	 */
	public void setDeliveredDate(LocalDate deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	private int ID;
	private LocalDate orderDate;
	private boolean status;
	private boolean delivered;
	private LocalDate deliveredDate;
	private int customerID;
	private int discount;
}
