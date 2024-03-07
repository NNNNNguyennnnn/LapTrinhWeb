package com.ecommerce.services;

import java.util.List;

import com.ecommerce.entities.BrandEntity;

public interface BrandService {
	public BrandEntity getByID(int brandID);

	public List<BrandEntity> getAllViaName(String name);

	public 
}
