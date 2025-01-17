package com.ec.test.entities.enums;

/**
 * Enums for status
 *
 * @author Kruger
 * @version 1.0
 */

public enum Status {
    INACTIVE("0"), ACTIVE("1");

    public final String value;

    Status(String value) {
        this.value = value;
    }
}
