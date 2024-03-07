package com.common.entities;

public class WardEntity {
	/**
	 * @return the id
	 */
	public int getId() {
		return ID;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int ID) {
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
	 * @return the districtID
	 */
	public int getDistrictID() {
		return districtID;
	}
	/**
	 * @param districtID the districtID to set
	 */
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}
	
	private int ID;
	private String name;
	private int districtID;
}
