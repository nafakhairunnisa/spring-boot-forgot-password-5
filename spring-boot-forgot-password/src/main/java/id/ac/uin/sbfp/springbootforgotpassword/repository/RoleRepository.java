package id.ac.uin.sbfp.springbootforgotpassword.repository;

import id.ac.uin.sbfp.springbootforgotpassword.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}