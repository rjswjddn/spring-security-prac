package com.example.security.domain.user.service;

import com.example.security.domain.user.dto.SignUpRequestDto;

public interface UserService {

    public Long signUp(SignUpRequestDto signUpRequestDto) throws Exception;
}
