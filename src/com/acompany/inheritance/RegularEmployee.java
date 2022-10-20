package com.acompany.inheritance;

public class RegularEmployee extends Employee {
    private int transportationAllowance;

    public RegularEmployee(String name, long salary, int ta) {
        super(name, salary);
        this.transportationAllowance = ta;
    }

    @Override
    public final long paySalary() {
        return this.salary / 12 + this.transportationAllowance;
    }

    public int getTransportationAllowance() {
        return transportationAllowance;
    }

    @Override
    public String toString() {
        return "RegularEmployee{" +
                "transportationAllowance=" + transportationAllowance +
                '}';
    }
}
