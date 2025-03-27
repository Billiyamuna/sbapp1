package com.vcube.Sbapp002.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.Sbapp002.model.Employee;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@GetMapping
	String hello() {
		return "Hello Sb App02";
	}
	
	@PostMapping("employee/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee createEmp(@RequestBody Employee emp) {
		return emp;
	}
	@PutMapping("employee/{eid}/update")
	Employee updateEmp(@RequestBody Employee emp, @PathVariable int eid) {
		return emp;
		
	}
	
	
	
	
	//  http://localhost:8080/api/v1/employees/info?eid=1&fname=omkar&lname=m&sal=400000.00
	@GetMapping("employees/info")
	Employee getEmployeeByRequestParam(
			@RequestParam int eid,
			@RequestParam String fname,
			@RequestParam String lname,
			@RequestParam double sal) {
		return new Employee(eid,fname, lname, sal);
		
	}
	
	
	@GetMapping("employees/{eid}/{fname}/{lname}/{sal}")
	public Employee getEmployeeByPathVariable(
			@PathVariable int eid,
			@PathVariable String fname,
			@PathVariable String lname,
			@PathVariable double sal) {
		return new Employee(eid, fname, lname, sal);
	}
	@GetMapping("/emplist")
	List<Employee> getEmplist(){
		List<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1,"Nikhil", "A", 600000.00));
		emplist.add(new Employee(1,"Nandhu", "A", 900000.00));
		emplist.add(new Employee(1,"Nani", "A", 200000.00));
		emplist.add(new Employee(1,"sanu", "A", 300000.00));
		return emplist;
		
	}
	@DeleteMapping("employee/{eid}/delete") 
	String deleteEmployee(@PathVariable int eid) {
		return "Deleted Successfully";
		
	}
	
	@GetMapping("/emp")
	Employee getEmployee() {
		return new Employee(1,"sai","s",399999.00);
	}

}
