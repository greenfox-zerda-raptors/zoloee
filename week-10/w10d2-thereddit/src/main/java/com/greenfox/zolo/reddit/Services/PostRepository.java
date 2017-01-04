package com.greenfox.zolo.reddit.Services;

import com.greenfox.zolo.reddit.Models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zoloe on 2017. 01. 04..
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}