package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;


    public static void main(String[] args) {
        System.out.println("welcome to Employee Wage Computation Program");
        int randomVal = (int) Math.floor(Math.random() * 10) % 2;
        if (randomVal == 1) {
            int empHrs = 8;
            int empWage = WAGE_PER_HOUR * empHrs;

            System.out.println("Emp Wage:" + empWage);

            System.out.println("Employee is present");
        }
            int empHrs = 0;
            int empWage = 0;
            int checkAttendance = (int)Math.floor(Math.random()*10)%3;
            if(checkAttendance == IS_FULL_TIME){
                System.out.println("Employee works for Full Time");
                empHrs = 8;
            }
            else if(checkAttendance == IS_PART_TIME){
                System.out.println("Employee works for Part Time");
                empHrs = 4;
            }

        else {
                System.out.println("Employee is Absent");
            }
    }
}
