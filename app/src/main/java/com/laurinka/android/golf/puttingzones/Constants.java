package com.laurinka.android.golf.puttingzones;

/**
 * Various constants
 */
public enum Constants {

    ZONE0("zone0"),
    ZONE1("zone1"),
    ZONE2("zone2"),
    ZONE3("zone3"),
    ZONE4("zone4"),
    ZONE5("zone5"),
    ZONE6("zone6"),
    DATA("data");

    private String definition;

    Constants(String tmp) {

        definition = tmp;
    }

    public String getString() {
        return definition;
    }
}
