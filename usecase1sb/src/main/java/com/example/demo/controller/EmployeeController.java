package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpDao;
import com.example.demo.service.EmployeeService;

@RestController

@RequestMapping("/emp")

public class EmployeeController {

	@Autowired
	private EmployeeService empservice;
	
	@GetMapping(value="/getEmpDetails")
			public List<EmpDao> getEmpDetails() {
				return empservice.getEmpDetails();
			}
}
