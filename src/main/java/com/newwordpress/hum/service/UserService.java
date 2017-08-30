package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.user.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
