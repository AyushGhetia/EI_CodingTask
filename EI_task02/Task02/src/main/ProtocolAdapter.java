package main;

public class ProtocolAdapter {
    public void connect(String protocolType) {
        if (protocolType.equalsIgnoreCase("WebSocket")) {
            System.out.println("Connecting via WebSocket...");
        } else if (protocolType.equalsIgnoreCase("HTTP")) {
            System.out.println("Connecting via HTTP...");
        } else {
            System.out.println("Unknown protocol type.");
        }
    }
}
