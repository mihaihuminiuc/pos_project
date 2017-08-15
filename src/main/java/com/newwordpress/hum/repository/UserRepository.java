package com.newwordpress.hum.repository;

import com.newwordpress.hum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByUserDataEmail(String email);
}
