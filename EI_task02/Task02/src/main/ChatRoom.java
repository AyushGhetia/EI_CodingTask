package main;

import java.util.ArrayList;
import java.util.List;
import patterns.Subject;
import patterns.Observer;

public class ChatRoom implements Subject {
    private String roomId;
    private List<Observer> users;
    private List<Message> messages;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public void addMessage(Message message) {
        messages.add(message);
        notifyObservers(message);
    }

    public List<Message> getMessageHistory() {
        return new ArrayList<>(messages); // Return a copy of message history
    }

    public List<String> getActiveUsernames() {
        List<String> activeUsernames = new ArrayList<>();
        for (Observer user : users) {
            if (user instanceof User) {
                activeUsernames.add(((User) user).getUsername());
            }
        }
        return activeUsernames;
    }

    @Override
    public void registerObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer user : users) {
            user.update(message);
        }
    }
}
