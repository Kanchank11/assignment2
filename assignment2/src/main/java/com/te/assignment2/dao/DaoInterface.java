package com.te.assignment2.dao;


import java.util.List;

import com.te.assignment2.dto.*;

public interface DaoInterface {
	
	

	void add(Employee employee);

	void update(Employee id);

	Employee findById(int id);

	List findAll();


	void delete(Employee employee);

	
	

}
