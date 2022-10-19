package com.acompany.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee emp = new Employee("kim", 5000);
        System.out.println(emp);

        Employee mgr = new Manager("kim", 4000, 2000);
        System.out.println(mgr);

    }
}
