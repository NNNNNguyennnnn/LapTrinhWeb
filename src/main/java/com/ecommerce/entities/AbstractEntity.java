package com.ecommerce.entities;

import java.time.LocalDate;

public abstract class AbstractEntity {
	protected int ID;
	protected int createBy;
	protected LocalDate createDate;
	protected int updateBy;
	protected LocalDate updateDate;
	protected int deleteBy;
	protected LocalDate deleteDate;
	protected boolean status;

	protected AbstractEntity() {

	}

	protected AbstractEntity(int ID, int createBy, LocalDate creatDate) {
		this.ID = ID;
		this.createBy = createBy;
		this.createDate = creatDate;
	}
}
