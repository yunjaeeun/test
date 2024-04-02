package com.cineverse.repo;

import com.cineverse.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByLoginId(String loginId);
    boolean existsByNickname(String nickName);
    Optional<User> findByLoginId(String loginId);
}
