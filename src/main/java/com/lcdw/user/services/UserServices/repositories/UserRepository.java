package com.lcdw.user.services.UserServices.repositories;

import com.lcdw.user.services.UserServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, String> {


}
