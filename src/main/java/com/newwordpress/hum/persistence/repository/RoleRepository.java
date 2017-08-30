package com.newwordpress.hum.persistence.repository;

import com.newwordpress.hum.persistence.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

    @Override
    void delete(Role role);

}
