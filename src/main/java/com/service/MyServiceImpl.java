package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Crud;
import com.model.Cricketer;

@Service
public class MyServiceImpl implements MyService {
	
	private Crud crud;
	@Autowired
	public void setCrud(Crud crud) {
		this.crud = crud;
	}

	@Override
	public String saveMyData(Cricketer cricketer) {
		return crud.saveDataToCrud(cricketer);
		
	}

	@Override
	public List<Cricketer> readMyData() {
		return crud.readDataCrud();
	}

	@Override
	public String deleteMyData(int id) {
		// TODO Auto-generated method stub
		return crud.deleteData(id);
	}

	

}
