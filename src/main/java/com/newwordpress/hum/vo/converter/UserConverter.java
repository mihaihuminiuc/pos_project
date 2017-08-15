package com.newwordpress.hum.vo.converter;

import com.newwordpress.hum.model.User;
import com.newwordpress.hum.vo.UserVO;
import org.springframework.stereotype.Service;

/**
 * Created by humin on 4/9/2017.
 */

@Service
public class UserConverter {

    public UserVO toVO(User user){

        UserVO userVO=new UserVO();
        userVO.setId(user.getId());
        userVO.setUsername(user.getUsername());
        userVO.setPassword(user.getPassword());
        userVO.setPasswordConfirm(user.getPasswordConfirm());

        return userVO;
    }
}
