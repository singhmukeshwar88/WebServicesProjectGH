package org.mukesh.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mukesh.entity.Employee;

public class EmployeeService {

	static Map<Long,Employee> map = new HashMap<Long,Employee>();
	
	static Employee employee = null;
	
	public EmployeeService(){
		
		/*employee = new Employee();
		employee.setEmpID(1);
		employee.setEmpName("Mukeshwar Singh");
		employee.setAge(28);
		
		Employee employee1 = new Employee();
		employee1.setEmpID(2);
		employee1.setEmpName("Ritesh Singh");
		employee1.setAge(23);
		map.put(1L, employee);
		map.put(2L, employee1);*/
	}
	static{
		employee = new Employee();
		employee.setEmpID(1);
		employee.setEmpName("Mukeshwar Singh");
		employee.setAge(28);
		
		Employee employee1 = new Employee();
		employee1.setEmpID(2);
		employee1.setEmpName("Ritesh Singh");
		employee1.setAge(23);
		map.put(1L, employee);
		map.put(2L, employee1);
	}
	
	public static List<Employee> getEmployees(){		
		
		return new ArrayList<Employee>(map.values());
	}
	
	public static Employee getEmployee(long id){
		
		return map.get(id);
	}
	
	public static Employee addEmployee(Employee employee){
		
		 map.put(employee.getEmpID(), employee);
		 
		 return employee;	
	
	}
	
	public static Employee updateEmployee(Employee emp){
		
		map.put(emp.getEmpID(), emp);
		return map.get(emp.getEmpID());		
	}
	
	
	
}
