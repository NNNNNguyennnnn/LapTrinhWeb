package com.common.services;

import java.util.List;

import com.common.entities.DistrictEntity;

public interface DistrictService {
	public List<DistrictEntity> getAllByProvinceID(int provinceID);

	public DistrictEntity getByID(int districtID);

	public List<DistrictEntity> getAllViaName(String name);
}
