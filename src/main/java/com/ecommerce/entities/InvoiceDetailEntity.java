package com.ecommerce.entities;

public class InvoiceDetailEntity {
	/**
	 * @return the invoiceID
	 */
	public int getInvoiceID() {
		return invoiceID;
	}
	/**
	 * @param invoiceID the invoiceID to set
	 */
	public void setInvoiceID(int invoiceID) {
		this.invoiceID = invoiceID;
	}
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private int invoiceID;
	private int productID;
	private int quantity;
}
