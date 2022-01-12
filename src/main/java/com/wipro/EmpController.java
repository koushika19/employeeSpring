package com.wipro;


import java.util.List;
import java.util.Optional;

//import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	 EmpRepository employeeRepository;
	
		
	@PostMapping("/addEmployee")
	public String createEmployee(@RequestBody Employee employee) {
		 employeeRepository.save(employee);
		 return "Employee added";
	}
	
	@PostMapping("/addAllEmployees")
	public String addAllEmployees(@RequestBody List<Employee> empList) {
		 employeeRepository.saveAll(empList);
		 return "All Employees added";
	}
	
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return  (List<Employee>) employeeRepository.findAll();
	}

	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		Optional<Employee> op= employeeRepository.findById(id);
		if(!op.isPresent())
			throw new NullPointerException();
		return op.get();
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		 employeeRepository.deleteById(id);
		 return "Employee with id: " + id + " is deleted";
	}
}

    


	

