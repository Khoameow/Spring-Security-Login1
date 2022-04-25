package com.login.Spring.Security.Login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposity  extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
