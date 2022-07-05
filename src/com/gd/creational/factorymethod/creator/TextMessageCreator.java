package com.gd.creational.factorymethod.creator;

import com.gd.creational.factorymethod.message.Message;
import com.gd.creational.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
