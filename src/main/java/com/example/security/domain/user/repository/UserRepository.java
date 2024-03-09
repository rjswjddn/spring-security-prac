package com.example.security.domain.user.repository;

import com.example.security.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(String id); //이메일로 Member 찾기
    boolean existsById(String id); //이메일로 Member 존재 여부 확인
}
