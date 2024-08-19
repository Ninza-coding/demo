package com.dao;

import java.util.List;

import com.model.Cricketer;

public interface Crud {

	public String saveDataToCrud(Cricketer cricketer);
	public List<Cricketer> readDataCrud();
	public String deleteData(int id);
}
