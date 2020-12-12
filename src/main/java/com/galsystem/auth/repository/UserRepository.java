package com.galsystem.auth.repository;

import com.galsystem.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u from User u where  u.userName =:userName")
    User findByUserName(@Param("userName") String userName);
}
