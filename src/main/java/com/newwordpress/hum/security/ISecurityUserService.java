package com.newwordpress.hum.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
