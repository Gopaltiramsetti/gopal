package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.EmpDao;
@Service
public class EmployeeService {
@Autowired
private EmployeeDao emprepo;
public List<EmpDao> getEmpDetails() {
	// TODO Auto-generated method stub
	return emprepo.findAll();// @formatter:off
 
	// @formatter:on

}

}
