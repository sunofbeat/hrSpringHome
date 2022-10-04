package com.my.spring.web.hr.web;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.web.hr.domain.Laborer;
import com.my.spring.web.hr.service.LaborerService;

@RestController("hr.laborerController")
@RequestMapping("com/my/hr/main")
public class LaborerController {
	@Autowired private LaborerService laborerService;
	
	@GetMapping
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("com/my/hr/main");
		return mv;
	}
	
	@GetMapping("list")
	public List<Laborer> getLaborers() {
		return laborerService.getLaborers();
	}
	
	@PostMapping("add")	
	public void addLaborer(@RequestBody String laborerName, LocalDate hireDate) {
		laborerService.addLaborer(laborerName, hireDate);
	}
	
	@PutMapping("fix")
	public void fixLaborer(@RequestBody Laborer laborer) {
		laborerService.fixLaborer(laborer);
	}
	
	@DeleteMapping("del/{userId}")
	public void delLaborer(@PathVariable int laborerId) {
		laborerService.delLaborer(laborerId);
	}
}
