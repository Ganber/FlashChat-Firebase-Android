package com.eranatia.flashchatnewfirebase;

/**
 * Created by erana on 25/09/2017.
 */

public class InstantMessage {

    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage(){
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
