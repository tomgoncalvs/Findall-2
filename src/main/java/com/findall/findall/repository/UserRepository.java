package com.findall.findall.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.findall.findall.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
