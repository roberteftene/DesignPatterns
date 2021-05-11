package gof.dp.behavioral.chain;

public class ChatMessage {
    String destination;
    String text;
    int priority;

    public ChatMessage(String destination, String text, int priority) {
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
