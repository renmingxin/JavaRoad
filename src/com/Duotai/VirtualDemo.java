package com.Duotai;

public class VirtualDemo {
    public static void main(String[] args){
        Salary s = new Salary("员工A","北京",3,10000.00);
        Employee e = new Salary("员工B","成都",2,8000.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();
    }
}
