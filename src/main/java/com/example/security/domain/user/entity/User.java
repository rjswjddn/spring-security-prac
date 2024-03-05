package com.example.security.domain.user.entity;

import com.example.security.domain.BaseTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 15, unique = true)
    private String id;

    @Column(length = 20)
    private String pwd;

    private String email;

    private String phone;

    private String address;

    private Role role;

    public void encodePwd(PasswordEncoder passwordEncoder) {
        this.pwd = passwordEncoder.encode(pwd);
    }
}
