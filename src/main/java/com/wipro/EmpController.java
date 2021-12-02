package com.wipro;


import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/Employee")

public class EmpController {
	Employee emp1= new Employee ("Alpha",22,50000);
	Employee emp2= new Employee ("Beta",23,40000);
	Employee emp3= new Employee ("Caroline",32,30000);
	Employee emp4= new Employee ("Damon",42,20000);
	Employee emp5= new Employee ("Elsa",30,70000);
	Employee emp6= new Employee ("Flora",25,80000);
	Employee emp7= new Employee ("Gaara",29,10000);
	Employee emp8= new Employee ("Hinata",26,19000);
	Employee emp9= new Employee ("Itachi",35,11000);
	Employee emp10= new Employee ("Jungkook",24,500000);
	
	List<Employee>employeeList= new ArrayList<>();
	List<String> res=new ArrayList<>();
	
	@GetMapping("/addDetails")
	public String addEmployeeDetails() {
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.add(emp5);
		employeeList.add(emp6);
		employeeList.add(emp7);
		employeeList.add(emp8);
		employeeList.add(emp9);
		employeeList.add(emp10);
		
		return "Details added successfully";
	}
	@GetMapping("/showDetails")
	
	public List<Employee> showDetails() {
         return employeeList; 
	}
	
	@GetMapping("/showEmployeeswithSalaryabove35000")
	public List<String>showHighSalary(){
		for(Employee employee:employeeList) {
			if(employee.getSalary()>35000)
				res.add(employee.getName());
	}
	
	return res;
}
	
}
