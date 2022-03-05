package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HRS = 100;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;
        int totalWorkingHrs = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHrs <= MAX_WORKING_HRS) {
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
            totalWorkingHrs = totalWorkingHrs + empHrs;
            totalWorkingDays++;
        }
        System.out.println("Total Working Hours = " +totalWorkingHrs);
        System.out.println("Total Working Days = " +totalWorkingDays);
        System.out.println("Total Employee wage is " +totalEmpWage);
    }
}