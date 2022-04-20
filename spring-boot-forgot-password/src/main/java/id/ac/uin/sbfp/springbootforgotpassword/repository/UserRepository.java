package id.ac.uin.sbfp.springbootforgotpassword.repository;

import id.ac.uin.sbfp.springbootforgotpassword.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}