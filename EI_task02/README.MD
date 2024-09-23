# Real-Time Chat Application
This project is a simple real-time chat application built using Java. 
The application allows users to create or join chat rooms, send and receive messages, and view a list of active users. 
The system follows design patterns such as Singleton, Observer, and Adapter, ensuring flexibility, modularity, and scalability.

## Table of Contents
Features
Design Patterns Used
Installation
Usage
Technologies Used
Best Practices Followed
Project Structure
Possible Improvements
Contributing

## Features
Users can create or join chat rooms by entering a unique room ID.
Users can send and receive messages in real-time within a chat room.
A list of active users in the chat room is displayed.
(Optional) Support for private messaging between users.
(Optional) Message history persists even if a user leaves and rejoins a chat room.

## Design Patterns Used
Observer Pattern: To notify users (observers) when new messages are sent in the chat room.
Singleton Pattern: To manage a single instance of the chat room manager, ensuring all chat rooms are controlled centrally.
Adapter Pattern: To allow the system to work with different communication protocols (e.g., WebSocket, HTTP).

## Installation
Prerequisites
Java JDK (version 8 or higher)
Git (to clone the repository)

## How to Run the Project
1. Clone the repository from GitHub:
git clone https://github.com/yourusername/ChatApplication.git

2. Navigate to the project directory:
cd ChatApplication

3. Compile the Java files:
javac -d bin src/main/*.java src/patterns/*.java

4. Run the application:
java -cp bin main.Client

## Usage
## Basic Flow
Users can join an existing chat room or create a new one by specifying a unique chat room ID.
Once in a chat room, users can send messages, and the system will notify all active users.
The list of active users is displayed, and users can leave the room or join another.


## Technologies Used
1. Java: The programming language used for the application.
2. Git: For version control and repository management.


## Best Practices Followed
1. Code Organization: Each class is in its own file, and proper package structure is maintained.
2. Design Patterns: The Observer, Singleton, and Adapter patterns are implemented to ensure modularity and scalability.
3. Logging: Logging is used to track significant events like user activities and system errors.
4. Error Handling: Exception handling is in place for user input, connection protocols, and other potential errors.
5. Defensive Programming: The code validates inputs at various levels to avoid crashes and unexpected behavior.
6. SOLID Principles: The code adheres to SOLID principles, especially Single Responsibility and Open-Closed principles.

