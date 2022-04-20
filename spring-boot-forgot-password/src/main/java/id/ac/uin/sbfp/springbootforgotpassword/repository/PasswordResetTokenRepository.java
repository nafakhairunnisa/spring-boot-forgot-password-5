package id.ac.uin.sbfp.springbootforgotpassword.repository;

import id.ac.uin.sbfp.springbootforgotpassword.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
}