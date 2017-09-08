package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.UserData;
import com.newwordpress.hum.persistence.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by humin on 4/8/2017.
 */
@Service
public class UserDataServiceImpl  implements UserDataService {
    @Autowired
    private UserDataRepository userDataRepository;


    @Override
    public void save(UserData userData) {
        userDataRepository.save(userData);
    }

    @Override
    public UserData findById(Long id) {
        return userDataRepository.findOne(id);
    }
}
