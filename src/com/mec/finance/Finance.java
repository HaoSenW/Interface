package com.mec.finance;

import com.mec.about_interface.Employee;

public class Finance {
	private Employee employee;
	
	public Finance() {
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public double getSalary() {
		if(employee == null) {
			return 0.0;
		}
		
		return employee.salary();
	}
}
