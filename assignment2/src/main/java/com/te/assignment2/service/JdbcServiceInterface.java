package com.te.assignment2.service;


import java.util.List;

import com.te.assignment2.dto.*;

public interface JdbcServiceInterface {

	void add(Employee employee);

	void update(int id);

	Employee findById(int id);

	List findAll();

	void delete(int id);

}
