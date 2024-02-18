package com.shantesh.springdatajpalearning.springjpatype;

import com.shantesh.springdatajpalearning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
