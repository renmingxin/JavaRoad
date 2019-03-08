package com.Duotai;

public class Salary extends Employee{
    private double salary;//全年工资
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    private void setSalary(double newSalary) {
        if(newSalary >= 0.0){
            salary = newSalary;
        }
    }
    public void mailCheck(){
        System.out.println("Salary类的mailCheck方法");
        System.out.println("邮寄支票给："+getName()+"工资为："+ salary);
    }
    public double getSalary(){
        return salary;
    }
    public double computePay(){
        System.out.println("计算工资，付："+ getName());
        return salary/52;
    }
}
