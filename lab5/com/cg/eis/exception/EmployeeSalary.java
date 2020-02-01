package com.cg.eis.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * EmployeeSalary
 */
public class EmployeeSalary {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int salary;

    public static void main(String[] args) {
        EmployeeSalary mObject = new EmployeeSalary();
        mObject.salary = 1000;
        try {
            mObject.salaryCheck(mObject.salary);
        } catch (EmployeeException e) {
            // e.printStackTrace();
            System.out.println("Custom Exception "+e);
        }

        
    }

    public void salaryCheck(int salary) throws EmployeeException {
        if(salary < 3000){
            throw new EmployeeException("Less Salary");
        }else{
            System.out.println("Salary is fine");
        }
        
    }

    
}