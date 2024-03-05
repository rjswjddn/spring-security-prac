package com.example.security.domain.user.controller;

import com.example.security.domain.user.dto.SignUpRequestDto;
import com.example.security.domain.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public Long join(@Valid @RequestBody SignUpRequestDto signUpRequestDto) throws Exception {
        return userService.signUp(signUpRequestDto);
    }
}
