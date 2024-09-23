package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    public static void log(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(timestamp + ": " + message);
    }
}
