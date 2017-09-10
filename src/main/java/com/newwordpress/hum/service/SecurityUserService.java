package com.newwordpress.hum.service;

public interface SecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
