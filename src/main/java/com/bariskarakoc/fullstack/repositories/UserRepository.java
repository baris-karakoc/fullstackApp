package com.bariskarakoc.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bariskarakoc.fullstack.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
