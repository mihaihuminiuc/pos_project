package com.newwordpress.hum.service;

import com.newwordpress.hum.model.User;
import com.newwordpress.hum.vo.UserDataVO;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
