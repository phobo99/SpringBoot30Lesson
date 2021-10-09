package vn.techmaster.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vn.techmaster.security.model.User;


public interface UserRepo extends JpaRepository<User,Long>{
    @Query("SELECT u FROM User  u where u.email=?1")
    User findByEmail(String email);
}
