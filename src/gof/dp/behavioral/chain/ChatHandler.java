package gof.dp.behavioral.chain;

public abstract class ChatHandler {

    ChatHandler next = null;
    public abstract void processMessage(ChatMessage message);

    public void setNext(ChatHandler next) {
        this.next = next;
    }
}
