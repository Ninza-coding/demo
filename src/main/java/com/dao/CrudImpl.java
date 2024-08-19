package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Cricketer;


@Repository
public class CrudImpl implements Crud {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public String saveDataToCrud(Cricketer c) {
		String sql="Insert into cricketer(id, name, address, salary) values(?,?,?,?)";
		int update = jdbcTemplate.update(sql, c.getId(), c.getName(), c.getAddress(), c.getSalary());
		if(update==1) {
		return "Data Stored in Database";
		}
		return "Failed to Save In Database";
	}


	@Override
	public List<Cricketer> readDataCrud() {
		String sql="Select * from cricketer";
		List<Cricketer> list = jdbcTemplate.query(sql, new RowMapperImpl());
		return list;
	}


	@Override
	public String deleteData(int id) {
		String sql="DELETE FROM cricketer WHERE id = ?";
		 int update = jdbcTemplate.update(sql, id);
		System.out.println(update);
		String mess= Integer.toString(id);
		return "Data from Id "+mess+" Deleted";
		
	}


}
