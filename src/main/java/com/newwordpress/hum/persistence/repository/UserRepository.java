package com.newwordpress.hum.persistence.repository;

import com.newwordpress.hum.persistence.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Override
    void delete(User user);
}
