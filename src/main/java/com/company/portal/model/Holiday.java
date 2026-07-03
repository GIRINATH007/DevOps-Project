package com.company.portal.model;

import lombok.Getter;

@Getter
public class Holiday {
    private final java.time.Month month;
    private final int day;
    private final String name;

    public Holiday(java.time.Month month, int day, String name) {
        this.month = month;
        this.day = day;
        this.name = name;
    }
}
