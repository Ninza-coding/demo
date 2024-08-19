package com.service;

import java.util.List;

import com.model.Cricketer;

public interface MyService {
 
	public String saveMyData(Cricketer cricketer);
	public List<Cricketer> readMyData();
	public String deleteMyData(int id);
}
