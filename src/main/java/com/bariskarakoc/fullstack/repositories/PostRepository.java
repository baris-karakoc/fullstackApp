package com.bariskarakoc.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bariskarakoc.fullstack.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long>{
    
}
