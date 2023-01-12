package org.snva.ems.config;

import org.snva.ems.Runner;
import org.snva.ems.bean.Employee;
import org.snva.ems.readutils.ReadUtil;
import org.snva.ems.services.EmployeeServiceImpl;
import org.snva.ems.uiservices.EmployeeUIServiceImpl;
import org.springframework.context.annotation.Bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserConfig {
    @Bean(name = "reader")
    public BufferedReader getBufferReader(){
        return new BufferedReader(new InputStreamReader(System.in));



    }
    @Bean(name = "Employee")
    public List<Employee> getEmployees(){
        return new ArrayList<Employee>();
    }
    @Bean(name = "Runner")
    public Runner getRunner(){
        return new Runner();
    }
    @Bean(name = "readUtil")
    public ReadUtil getreadUtil(){
        return new ReadUtil();
    }
    @Bean(name = "employeeUIServiceImpl")
    public EmployeeUIServiceImpl getemployeeUIServiceImpl(){
        return new EmployeeUIServiceImpl();
    }
    @Bean(name = "employeeServiceImpl")
    public EmployeeServiceImpl getemployeeServiceImpl(){
        return new EmployeeServiceImpl();
    }


}
