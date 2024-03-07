package com.common.services;

import java.util.List;

import com.common.entities.ProvinceEntity;

public interface ProvinceService {
	public List<ProvinceEntity> getAllProvince();

	public ProvinceEntity getByID(int provinceID);

	public List<ProvinceEntity> getAllViaName(String name);
}
