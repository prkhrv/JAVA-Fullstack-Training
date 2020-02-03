package com.cg.eis.exception;

import java.io.BufferedReader;
import java.io.IOException;
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
        // TEST
        // mObject.salary = 1000;
        System.out.println("Enter the salary");
        try {
            mObject.salary = Integer.parseInt(mObject.br.readLine());
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
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