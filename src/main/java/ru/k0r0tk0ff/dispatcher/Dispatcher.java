package ru.k0r0tk0ff.dispatcher;

import ru.k0r0tk0ff.dispatcher.message.Message;
import ru.k0r0tk0ff.dispatcher.message.MessageType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Dispatcher pattern
 * adviced - Petr Arsentev (parsentev@yandex.ru)
 */
public class Dispatcher {

    private Map<MessageType, Function<Message, Boolean>> dispatch;

    public Dispatcher() {
        dispatch = new HashMap<>();
        dispatch.put(MessageType.Letter, toMail());
        dispatch.put(MessageType.Messenger, toMessenger());
    }

    /**
     * Handle to unknown.
     */
    public Function<Message, Boolean> toUnknown() {
        return msg -> {
            return false;
        };
    }

    /**
     * Handle to Mail.
     */
    private Function<Message, Boolean> toMail() {
        return msg -> {
            System.out.println(String.format("Message '%s' has been sent to Email '%s'", msg.getBody(), msg.getDestination()));
            return true;
        };
    }

    /**
     * Handle to Messenger.
     */
    private Function<Message, Boolean> toMessenger() {
        return msg -> {
            System.out.println(String.format("Message '%s' has been sent to Messenger: '%s'", msg.getBody(), msg.getDestination()));
            return true;
        };
    }

    /**
     * Sent message to dispatch
     */
    public boolean sent(final Message msg) {
        return this.dispatch.get(msg.getMessageType()).apply(msg);
    }
}
