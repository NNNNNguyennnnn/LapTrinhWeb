package com.common.entities;

public class DistrictEntity {
	/**
	 * @return the ID of district
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param ID: the ID to set district ID
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
	 * @return the provinceID
	 */
	public int getProvinceID() {
		return provinceID;
	}
	/**
	 * @param provinceID the provinceID to set
	 */
	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}
	
	private int ID;
	private String name;
	private int provinceID;
}
