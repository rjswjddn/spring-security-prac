package com.example.security.domain.user.dto;

import com.example.security.domain.user.entity.Role;
import com.example.security.domain.user.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserResponseDto {

    private Long idx;

    private String id;

    private String pwd;

    private String email;

    private String phone;

    private String address;

    private Role role;

    public static UserResponseDto of (User user) {
        return UserResponseDto.builder()
                .id(user.getId())
                .pwd(user.getPwd())
                .email(user.getEmail())
                .phone(user.getPhone())
                .address(user.getAddress())
                .role(user.getRole())
                .build();

    }
}
