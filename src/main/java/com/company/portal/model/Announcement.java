package com.company.portal.model;

import lombok.Getter;

@Getter
public class Announcement {
    private final String title;
    private final String summary;

    public Announcement(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }
}
