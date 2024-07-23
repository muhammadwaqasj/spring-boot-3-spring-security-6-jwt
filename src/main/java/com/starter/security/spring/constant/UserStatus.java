package com.starter.security.spring.constant;

public enum UserStatus {
    ACTIVE("Active"), INACTIVE("Inactive");
    private String value;

    UserStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
