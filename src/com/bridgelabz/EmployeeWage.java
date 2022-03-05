package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;


    public static void main(String[] args) {
        System.out.println("welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < 20) {
            int check = (int) Math.floor(Math.random() * 10) % 3;
            switch (check) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = WAGE_PER_HOUR * empHrs;
            totalEmpWage = totalEmpWage + empWage;
            totalWorkingDays++;
        }
        System.out.println("Employee wage is " + totalEmpWage);
    }
}