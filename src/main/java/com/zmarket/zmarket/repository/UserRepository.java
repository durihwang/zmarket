package com.zmarket.zmarket.repository;

import com.zmarket.zmarket.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // email을 통해서 생성된 사용자인지 체크
    Optional<User> findByEmail(String email);
}
