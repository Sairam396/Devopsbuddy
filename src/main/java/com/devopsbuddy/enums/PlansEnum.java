package com.devopsbuddy.enums;

/**
 * Created by rjeshg on 1/20/17.
 */
public enum PlansEnum {

    BASIC(1, "Basic"),
    PRO(2, "Pro");

    private final int id;

    private final String name;

    PlansEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
