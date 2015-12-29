package org.mukesh.controller;


import java.util.List;

import org.mukesh.entity.Employee;
import org.mukesh.service.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/employees")
public class RestController {

	
	@RequestMapping(value="/employee", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeDetails(){
		
		return EmployeeService.getEmployees();	
				
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee emp){
		System.out.println("Post Method:"+emp);
		return EmployeeService.addEmployee(emp);
	}
	
	@RequestMapping(value="/employee/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("id")long id){
		
		System.out.println("Employee ID:"+id);
		return EmployeeService.getEmployee(id);
	}
	
	@RequestMapping(value="/employee", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@RequestBody Employee emp){
		
		return EmployeeService.updateEmployee(emp);
		
	}

}
