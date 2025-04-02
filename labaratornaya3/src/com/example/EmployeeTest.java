package com.example;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeTest emp = new EmployeeTest();
        emp.setEmp,(101);
        emp.setName("Jane Smith");
        emp.setSalary(120_345.27);
        emp.setSsn("012-34-5678");

        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
