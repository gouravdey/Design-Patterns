package com.gd.structural.decorator;

public class TextMessage implements Message {

    private String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return message;
    }
}
