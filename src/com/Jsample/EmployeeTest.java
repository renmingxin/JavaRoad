package com.Jsample;

public class EmployeeTest {
    public static void main(String[] args){
        Employee one = new Employee("老王",20);
        Employee two = new Employee("老李",24);

        one.empDesignation("高级");
        one.empSalary(2000);
        one.printEmployee();

        two.empDesignation("中级");
        two.empSalary(1000);
        two.printEmployee();

    }
}
class test extends EmployeeTest{

}
