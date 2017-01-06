package com.greenfox.zolo.reddit.Services;
import com.greenfox.zolo.reddit.Models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


/**
 * Created by zoloe on 2017. 01. 05..
 */
@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    // constructorba kell mar rakni az autowiret igazibol

    public Page<Post> getAllPosts(Integer page, Integer limit) {
        return postRepository.findByOrderByScoreDesc(new PageRequest(page, limit));
    }

    public Post getNewPost(){
        return new Post();
    }

    public void savePost(Post post){
        postRepository.save(post);
    }

    public void upvote(long id){
        Post post = postRepository.findOne(id);
        post.incrementScore();
        postRepository.save(post);
    }

    public void downvote(long id){
        Post post = postRepository.findOne(id);
        post.decrementScore();
        postRepository.save(post);
    }

}
