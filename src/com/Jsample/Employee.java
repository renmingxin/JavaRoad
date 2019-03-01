package com.Jsample;

public class Employee {
    private String name;//姓名
    int age;//年龄
    String designation;//职位
    double salary;//薪水
    public Employee(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public void printEmployee(){
        System.out.println("名字:"+ name );
        System.out.println("年龄:" + age );
        System.out.println("职位:" + designation );
        System.out.println("薪水:" + salary);
    }
}
