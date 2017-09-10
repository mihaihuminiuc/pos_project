package com.newwordpress.hum.captcha;

import com.newwordpress.hum.web.error.ReCaptchaInvalidException;

public interface CaptchaServiceInterface {
    void processResponse(final String response) throws ReCaptchaInvalidException;

    String getReCaptchaSite();

    String getReCaptchaSecret();
}
