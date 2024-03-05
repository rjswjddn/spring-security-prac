package com.example.security.domain.user.service;

import com.example.security.domain.user.dto.SignUpRequestDto;
import com.example.security.domain.user.entity.User;
import com.example.security.domain.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public Long signUp(SignUpRequestDto signUpRequestDto) throws Exception {

        User user = userRepository.save(signUpRequestDto.toEntity());
        user.encodePwd(passwordEncoder);

        return user.getIdx();
    }
}
