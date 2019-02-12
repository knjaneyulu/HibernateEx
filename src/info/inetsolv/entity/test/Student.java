package info.inetsolv.entity.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_tbl")
public class Student {

	@Id
	@GeneratedValue
	private Integer sid;
	
	private String name;
	private Double salary;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Student(String name, Double salary) {
		super();
		
		this.name = name;
		this.salary = salary;
	}
	
	
}
