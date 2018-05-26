package com.realtime.employeeapp.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNames {

	static List<String> nameOfEmployees = new ArrayList<String>();
		
	static {
		nameOfEmployees.add("Alex Smith");
		nameOfEmployees.add("Bill Shannon");
		nameOfEmployees.add("Steve Demory");
	}
	
    @Value("${employee.name}")
    private String employeeName;

    @Value("${manager.name}")
    private String managerName;
    
    @GetMapping("/returnname")
    public List<String> employeeList(){
    	nameOfEmployees.add(employeeName);
    	nameOfEmployees.add(managerName);
    	
        return nameOfEmployees;
    }
}
