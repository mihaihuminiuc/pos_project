package com.newwordpress.hum.service;

import com.newwordpress.hum.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
