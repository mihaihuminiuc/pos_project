package com.newwordpress.hum.vo.converter;

import com.newwordpress.hum.persistence.model.user.UserData;
import com.newwordpress.hum.vo.UserDataVO;
import org.springframework.stereotype.Service;

/**
 * Created by humin on 4/9/2017.
 */


@Service
public class UserDataConverter {

    public UserDataVO toVO(UserData userData){

        UserDataVO userDataVO= new UserDataVO();

        userDataVO.setId(userData.getId());
        userDataVO.setDescription(userData.getDescription());
        userDataVO.setEmail(userData.getEmail());
        userDataVO.setFirstName(userData.getFirstName());
        userDataVO.setLastName(userData.getLastName());
        userDataVO.setPicture(userData.getPicture());
        return userDataVO;
    }
}
