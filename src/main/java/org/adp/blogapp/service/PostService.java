package org.adp.blogapp.service;

import java.util.Collection;
import java.util.Optional;

import org.adp.blogapp.model.Post;

public interface PostService {

    Optional<Post> getById(Long id);

    Collection<Post> getAll();

    Post save(Post post);

    void delete(Post post);
}

