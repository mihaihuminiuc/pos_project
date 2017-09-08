package com.newwordpress.hum.persistence.repository;

import com.newwordpress.hum.persistence.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mihai.huminiuc on 4/4/2017.
 */
public interface UserDataRepository extends JpaRepository<UserData, Long> {
    //Object save(UserDataVO userData);
    UserData findById(long id);
}
