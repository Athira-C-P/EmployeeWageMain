package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to Employee Wage Computation Program");
        int randomVal = (int)Math.floor(Math.random()*10) % 2;
        if(randomVal == 1)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");
    }
}
