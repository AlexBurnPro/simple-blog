package com.example.simpleblog.repositories;

import com.example.simpleblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepositories extends CrudRepository<Post, Long> {
}
