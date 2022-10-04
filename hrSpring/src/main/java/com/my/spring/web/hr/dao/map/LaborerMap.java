package com.my.spring.web.hr.dao.map;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.my.spring.web.hr.domain.Laborer;

public interface LaborerMap {
	List<Laborer> selectLaborers();
	Laborer selectLaborer(int laborerId);
	int insertLaborer(@Param("name")String laborerName, 
					@Param("hireDate")LocalDate hireDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int laborerId);
}
