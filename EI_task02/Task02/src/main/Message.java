package main;

public class Message {
    private String text;
    private String sender;

    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }
}
