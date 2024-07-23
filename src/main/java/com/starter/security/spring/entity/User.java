package com.starter.security.spring.entity;

import com.starter.security.spring.constant.UserStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record User(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id, String userName, String userPassword, UserStatus userStatus) {
}
