package gof.dp.behavioral.chain;

public class BroadcastMessageHandler extends ChatHandler {
    @Override
    public void processMessage(ChatMessage message) {
        if(!message.destination.toLowerCase().equals("@everyone")) {
            if(this.next != null) {
                this.next.processMessage(message);
            }
        }else {
            System.out.println(message.destination + ": " + message.text);
        }
    }
}
