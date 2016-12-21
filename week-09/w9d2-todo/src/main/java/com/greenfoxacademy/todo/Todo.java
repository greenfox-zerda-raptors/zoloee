package com.greenfoxacademy.todo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by zoloe on 2016. 12. 21..
 */
@Getter
@AllArgsConstructor
@ToString
public class Todo {
    int id;
    String title;
    Boolean urgent;
    Boolean done;
}
