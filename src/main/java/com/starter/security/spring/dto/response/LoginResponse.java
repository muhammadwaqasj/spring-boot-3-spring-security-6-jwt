package com.starter.security.spring.dto.response;

public record LoginResponse(String authenticationToken, String userName) {
}
