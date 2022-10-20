package com.acompany.inheritance;

public abstract class Employee implements Payable{
    protected String name;
    protected long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract long paySalary();

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
