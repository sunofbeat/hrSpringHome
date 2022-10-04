package com.my.spring.web.hr.dao;

import java.time.LocalDate;
import java.util.List;

import com.my.spring.web.hr.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	Laborer selectLaborer(int laborerId);
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int laborerId);	
}
