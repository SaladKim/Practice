package com.acompany.inheritance;

@FunctionalInterface
public interface Payable {

    long paySalary();
    default long payAllowance() {
        callLocal();
        return 0;
    }

    // Java9
    private void callLocal() {

    }

    static long testStatic() {
        return 1;
    }


}
