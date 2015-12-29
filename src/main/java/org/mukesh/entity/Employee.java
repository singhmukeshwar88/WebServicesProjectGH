package org.mukesh.entity;

//@XmlRootElement
public class Employee {
	
	private long empID;
	private String empName;
	private int age;
	
	public Employee(){
		
	}
	public Employee(long empID,String empName,int age){
		
		this.empID=empID;
		this.empName=empName;
		this.age=age;
	}
	
	public long getEmpID() {
		return empID;
	}
	public void setEmpID(long empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", age=" + age + "]";
	}
	
	

}
