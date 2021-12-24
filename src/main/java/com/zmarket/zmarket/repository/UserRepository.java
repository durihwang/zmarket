package com.zmarket.zmarket.repository;

import com.zmarket.zmarket.domain.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SocialUser, Long> {

    // email을 통해서 생성된 사용자인지 체크
    Optional<SocialUser> findByEmail(String email);
}
