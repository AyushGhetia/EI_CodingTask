package main;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Singleton to manage chat rooms
        ChatRoomManager chatRoomManager = ChatRoomManager.getInstance();

        // Create or get the existing chat room
        ChatRoom room123 = chatRoomManager.getChatRoom("Room123");

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Register users to the room
        room123.registerObserver(alice);
        room123.registerObserver(bob);
        room123.registerObserver(charlie);

        // Send messages
        room123.addMessage(new Message("Alice", "Hello, everyone!"));
        room123.addMessage(new Message("Bob", "How's it going?"));
        room123.addMessage(new Message("Charlie", "Goodbye!"));

        // Removing a user and sending another message
        room123.removeObserver(bob);
        room123.addMessage(new Message("Alice", "Bob has left the chat!"));
        System.out.println();

        // Display active users
        System.out.println("Active Users in " + room123.getRoomId() + ":");
        List<String> activeUsers = room123.getActiveUsernames();
        for (String user : activeUsers) {
            System.out.println(user);
        }
        System.out.println();

        // Display Message History
        System.out.println("Message History:");
        for (Message message : room123.getMessageHistory()) {
            System.out.println(message.getSender() + ": " + message.getText());
        }
        System.out.println();

        ProtocolAdapter adapter = new ProtocolAdapter();
        adapter.connect("WebSocket");

        Logging.log("Chat session ended.");
    }
}
