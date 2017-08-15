package com.newwordpress.hum.service;

import com.newwordpress.hum.model.UserData;
import com.newwordpress.hum.vo.UserDataVO;

/**
 * Created by humin on 4/8/2017.
 */
public interface UserDataService {

    void save(UserData user);
    UserData findById(Long id);

}
