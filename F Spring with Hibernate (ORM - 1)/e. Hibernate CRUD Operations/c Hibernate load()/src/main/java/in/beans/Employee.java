package in.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="emp_ragister")
public class Employee 
{
	@Id
	@Column(name ="emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_dept")
	private String empDept;
	
	@Column(name = "emp_city")
	private String empCity;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
	
}
