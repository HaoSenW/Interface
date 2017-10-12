package com.mec.about_interface.demo;

import com.mec.about_interface.CEO;
import com.mec.about_interface.Employee;
import com.mec.about_interface.HourWorker;
import com.mec.about_interface.Manager;
import com.mec.about_interface.Worker;
import com.mec.finance.Finance;

public class Company {
	public static void main(String[] args) {
		Finance finance = new Finance();
		double salaryAccount = 0.0;
		Employee[] employees = {
				new CEO(),
				new Manager(),
				new Manager(),
				new Manager(),
				new Worker(),
				new Worker(),
				new Worker(),
				new Worker(),
				new Worker(),
				new HourWorker(12),
				new HourWorker(120),
				new HourWorker(1200),
				new HourWorker(123),
				new HourWorker(121),
				new HourWorker(120),
				new HourWorker(124),
		};
		
		for(int i = 0; i < employees.length; i++) {
			finance.setEmployee(employees[i]);
			salaryAccount += finance.getSalary();
		}
		
		System.out.println("money:" + salaryAccount);
	}
}
