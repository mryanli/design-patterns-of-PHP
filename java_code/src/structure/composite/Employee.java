package structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	//
	public String name;
	public String dept;
	public int salary;
	private List<Employee> subordiantes;
	private List<Employee> allSubdinates;
	
	public Employee(String name,String dept,int sal) {
		this.name = name;
		this.dept = dept;
		this.salary = sal;
		this.subordiantes = new ArrayList<Employee>();
		this.allSubdinates = new ArrayList<Employee>();
				
	}
	
	public void add(Employee e) {
		subordiantes.add(e);
	}
	
	public void remove(Employee e) {
		subordiantes.remove(e);
	}
	
	public List<Employee> getSubordinates(){
		return this.subordiantes;
	}
	

	
	public String toString() {
		return String.format("employee:[name : %s ,dept : %s ,salary :%d",name,dept,salary);
		
	}

}
