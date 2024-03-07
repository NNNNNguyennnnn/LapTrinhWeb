package com.common.services;

import java.util.List;

import com.common.entities.WardEntity;

public interface WardService {
	public WardEntity getByID(int wardID);

	public List<WardEntity> getAllByDistrictID(int districtID);

	public List<WardEntity> getAllViaName(String name);
}
