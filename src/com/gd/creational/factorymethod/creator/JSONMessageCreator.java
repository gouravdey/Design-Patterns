package com.gd.creational.factorymethod.creator;

import com.gd.creational.factorymethod.message.JSONMessage;
import com.gd.creational.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
