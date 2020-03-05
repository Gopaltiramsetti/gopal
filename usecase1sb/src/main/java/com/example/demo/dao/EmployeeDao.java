package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmpDao;

public interface EmployeeDao extends JpaRepository<EmpDao,Integer>
{
	
	}
