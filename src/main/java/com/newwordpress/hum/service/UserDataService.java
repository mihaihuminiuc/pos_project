package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.UserData;

/**
 * Created by humin on 4/8/2017.
 */
public interface UserDataService {

    void save(UserData user);
    UserData findById(Long id);

}
