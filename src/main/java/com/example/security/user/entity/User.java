package com.example.security.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class User {
    @Id
    private Long idx;
    private String id;
    private String pwd;
    private String email;
    private String phone;
    private String address;
}
