package com.my.spring.web.hr.domain;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Laborer {
	private int laborerId;
	private String name;
	private LocalDate hireDate;
}
