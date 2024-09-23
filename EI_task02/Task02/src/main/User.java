package main;

import patterns.Observer;

public class User implements Observer {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(Message message) {
        System.out.println("[" + username + "] " + message.getSender() + ": " + message.getText());
    }

    public String getUsername() {
        return username;
    }
}
