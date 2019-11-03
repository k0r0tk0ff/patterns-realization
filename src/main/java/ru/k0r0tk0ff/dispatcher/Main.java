package ru.k0r0tk0ff.dispatcher;

import ru.k0r0tk0ff.dispatcher.message.Message;
import ru.k0r0tk0ff.dispatcher.message.MessageType;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setBody("message body");
        message.setDestination("mail@mail.ru");
        message.setMessageType(MessageType.Letter);

        Message messageForMessanger = new Message();
        messageForMessanger.setBody("message body for messageForMessanger");
        messageForMessanger.setDestination("viber");
        messageForMessanger.setMessageType(MessageType.Messenger);

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.sent(message);
        dispatcher.sent(messageForMessanger);
    }
}
