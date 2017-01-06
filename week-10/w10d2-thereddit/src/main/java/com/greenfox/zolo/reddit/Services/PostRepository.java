package com.greenfox.zolo.reddit.Services;

import com.greenfox.zolo.reddit.Models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Page<Post> findByOrderByScoreDesc(Pageable pageable);

}