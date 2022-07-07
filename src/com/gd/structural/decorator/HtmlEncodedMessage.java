package com.gd.structural.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

public class HtmlEncodedMessage implements Message {

    private Message message;

    public HtmlEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
