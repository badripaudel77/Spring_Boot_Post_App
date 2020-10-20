package com.io.badri.vehicles.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.io.badri.vehicles.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
	
  List<Post> findAllByOrderByIdDesc();

}
