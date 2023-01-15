package com.bariskarakoc.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bariskarakoc.fullstack.entities.Like;

public interface LikeRepository extends JpaRepository<Like, Long>{
    
}
