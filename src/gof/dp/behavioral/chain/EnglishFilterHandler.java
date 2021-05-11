package gof.dp.behavioral.chain;

public class EnglishFilterHandler extends ChatHandler {

    String[] forbiddenWords = new String[]{"dirtyword1", "dirtyword2"};

    @Override
    public void processMessage(ChatMessage message) {
        boolean msgIsValid = true;
        for (String word : forbiddenWords) {
            if (message.text.contains(word)) {
                msgIsValid = false;
                break;
            }
        }
        if (msgIsValid) {
            if (this.next != null) {
                this.next.processMessage(message);
            }
        }
    }
}
