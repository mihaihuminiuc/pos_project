package com.newwordpress.hum.repository;

import com.newwordpress.hum.model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mihai.huminiuc on 4/4/2017.
 */
public interface UserDataRepository extends JpaRepository<UserData, Long> {
    //UserData findById(long id);
}
