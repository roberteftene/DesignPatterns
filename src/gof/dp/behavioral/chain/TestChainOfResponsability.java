package gof.dp.behavioral.chain;

public class TestChainOfResponsability {

    public static void main(String[] args) {
        ChatHandler broadcastMsgHandler = new BroadcastMessageHandler();
        ChatHandler privateMsgHandler = new PrivateMessageHandler();
        ChatHandler englishFilterHandler = new EnglishFilterHandler();

        englishFilterHandler.setNext(privateMsgHandler);
        privateMsgHandler.setNext(broadcastMsgHandler);

        ChatHandler chatServer = englishFilterHandler;
        chatServer.processMessage(new ChatMessage("@everyone","dirtyword1?",2));
        chatServer.processMessage(new ChatMessage("@everyone","Hello guys!",3));
        chatServer.processMessage(new ChatMessage("@john","How are you?",2));

    }

}
