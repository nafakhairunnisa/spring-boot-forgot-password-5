package id.ac.uin.sbfp.springbootforgotpassword.service.framework;

import id.ac.uin.sbfp.springbootforgotpassword.entity.PasswordResetToken;

public interface PasswordResetTokenService {
    PasswordResetToken findByToken(String token);

    PasswordResetToken save(PasswordResetToken passwordResetToken);
}