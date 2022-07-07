package com.gd.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Message message = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(message.getContent());

        Message decoratedHtmlMessage = new HtmlEncodedMessage(message);
        System.out.println(decoratedHtmlMessage.getContent());

        Message decoratedBase64Message = new Base64EncodedMessage(message);
        System.out.println(decoratedBase64Message.getContent());
    }
}
