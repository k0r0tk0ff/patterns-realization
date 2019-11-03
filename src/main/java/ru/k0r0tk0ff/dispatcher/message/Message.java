package ru.k0r0tk0ff.dispatcher.message;

public class Message {
    private MessageType messageType;
    private String body;
    private String destination;

    public ru.k0r0tk0ff.dispatcher.message.MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(ru.k0r0tk0ff.dispatcher.message.MessageType messageType) {
        this.messageType = messageType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
