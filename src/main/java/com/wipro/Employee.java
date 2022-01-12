package com.wipro;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;


//import com.org.Organization;

@Entity
// @Table
public class Employee {
	@Id
	@GeneratedValue
//	@Column  
	private int id;
//	@Column  
	private String name;
//	@Column  
	private int age;
//	@Column  
	private long salary;
//	@Column  
	private String orgName;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, int age, long salary,String orgName ) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.orgName = orgName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	 
	
	
}