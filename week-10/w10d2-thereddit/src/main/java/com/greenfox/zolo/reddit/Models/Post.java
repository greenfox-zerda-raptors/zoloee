package com.greenfox.zolo.reddit.Models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by zoloe on 2017. 01. 04..
 */
@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String content;
    private long score;

    public Post() {
    }

    public Post(String content) {
        this.content = content;
    }

    public void incrementScore(){
        score++;
    }

    public void decrementScore(){
        score--;
//        return this;
    }

}
