package com.starter.security.spring.constant;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class UserStatusConverter implements AttributeConverter<UserStatus, String> {

    @Override
    public String convertToDatabaseColumn(UserStatus userStatus) {
        return userStatus != null ? userStatus.getValue() : null;
    }

    @Override
    public UserStatus convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        return Stream.of(UserStatus.values()).filter(c -> c.getValue().equals(s)).findFirst().orElseThrow(IllegalArgumentException::new);

    }
}
