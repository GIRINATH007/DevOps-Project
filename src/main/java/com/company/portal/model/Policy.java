package com.company.portal.model;

import lombok.Getter;

@Getter
public class Policy {
    private final String title;
    private final String description;

    public Policy(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
