package com.acompany.inheritance;

public final class Chef extends Employee {
    private String stars;

    public Chef(String name, long salary, String stars) {
        super(name, salary);
        this.stars = stars;
    }
}
