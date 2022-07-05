package com.gd.creational.factorymethod.creator;

import com.gd.creational.factorymethod.message.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();

        message.addDefaultHeaders();
        message.encrypt();

        return message;
    }

    public abstract Message createMessage();
}
