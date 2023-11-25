package com.backend.springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.springboot.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}