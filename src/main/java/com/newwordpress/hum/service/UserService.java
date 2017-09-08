package com.newwordpress.hum.service;

import com.newwordpress.hum.persistence.model.PasswordResetToken;
import com.newwordpress.hum.persistence.model.User;
import com.newwordpress.hum.persistence.model.VerificationToken;
import com.newwordpress.hum.web.dto.UserDto;
import com.newwordpress.hum.web.error.UserAlreadyExistException;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface UserService {
    /*
    void save(User user);
    User findByUsername(String username);
    */

    User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    VerificationToken generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordResetToken getPasswordResetToken(String token);

    User getUserByPasswordResetToken(String token);

    User getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    String generateQRUrl(User user) throws UnsupportedEncodingException;

    User updateUser2FA(boolean use2FA);

    List<String> getUsersFromSessionRegistry();
}
