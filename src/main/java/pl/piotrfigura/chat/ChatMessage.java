package pl.piotrfigura.chat;

public class ChatMessage {

    private String value;

    public ChatMessage(String value) {
        this.value = value;
    }

    public ChatMessage() {
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
