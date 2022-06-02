package com.qaprosoft.carina.demo.service;

public enum Browsers {
    CHROME("chrome"), FIREFOX ("firefox"), SAFARI ("safari");

    private final String title;

    Browsers(String browserName) {
        this.title = browserName;
    }

    public String getTitle() {
        return title;
    }
}

