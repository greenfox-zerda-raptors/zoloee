package com.gf;

/**
 * Created by zoloe on 2016. 12. 21..
 */

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message (from HelloWorld.java): " + message);
    }
}