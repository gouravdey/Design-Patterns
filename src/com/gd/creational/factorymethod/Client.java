package com.gd.creational.factorymethod;

import com.gd.creational.factorymethod.creator.JSONMessageCreator;
import com.gd.creational.factorymethod.creator.MessageCreator;
import com.gd.creational.factorymethod.creator.TextMessageCreator;
import com.gd.creational.factorymethod.message.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message message = creator.getMessage();
        System.out.println(message.getContent());
    }
}
