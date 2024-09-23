##Design Patterns in Java
Overview
This project demonstrates the implementation of various software design patterns in Java. 
The project includes examples of behavioral, creational, and structural design patterns, each represented by practical use cases. 
The code is well-structured and adheres to best practices such as exception handling, defensive programming, logging, and performance optimization.

Project Structure

DesignPatternsDemo/
├── src/
│   ├── behavioral/
│   │   ├── PaymentStrategy.java
│   │   ├── CreditCardPayment.java
│   │   ├── PayPalPayment.java
│   │   ├── Observer.java
│   │   ├── Investor.java
│   │   ├── StockTicker.java
│   ├── creational/
│   │   ├── Logger.java
│   │   ├── Notification.java
│   │   ├── EmailNotification.java
│   │   ├── SMSNotification.java
│   │   ├── NotificationFactory.java
│   ├── structural/
│   │   ├── USBPort.java
│   │   ├── OldUSBDevice.java
│   │   ├── USBtoUSBCAdapter.java
│   │   ├── Order.java
│   │   ├── BasicOrder.java
│   │   ├── GiftWrap.java
│   │   ├── ExpeditedShipping.java
│   ├── tests/
│   │   └── Main.java
└── bin/
Design Patterns Implemented

Behavioral Patterns
Strategy Pattern: Demonstrates how different payment methods (CreditCard and PayPal) implement the PaymentStrategy interface to provide different behaviors.
Observer Pattern: Shows how investors (observers) are notified of stock price changes in the StockTicker.

Creational Patterns
Singleton Pattern: The Logger class ensures that only one instance is created and used throughout the application.
Factory Pattern: The NotificationFactory dynamically creates instances of EmailNotification and SMSNotification based on the provided type.

Structural Patterns
Adapter Pattern: The USBtoUSBCAdapter allows an old USB device to connect via a new USB-C port.
Decorator Pattern: Demonstrates adding functionalities like GiftWrap and ExpeditedShipping to a basic Order object.


How to Run the Project

1. Prerequisites
Ensure that the following are installed on your machine:
Java Development Kit (JDK) 11 or higher
Git

2. Clone the Repository
git clone https://github.com/your-username/DesignPatternsDemo.git
cd DesignPatternsDemo

3. Compile the Code
javac -d bin src/**/*.java

4. Run the Project
Run the Main class to see all the design pattern implementations:
java -cp bin tests.Main

Code Overview
1. Behavioral Patterns
Strategy Pattern
PaymentStrategy.java: Defines the payment strategy interface.
CreditCardPayment.java: Implements credit card payment.
PayPalPayment.java: Implements PayPal payment.
Usage: Different strategies for handling payments are defined.

Observer Pattern
Observer.java: Observer interface for the stock ticker.
StockTicker.java: Notifies all investors when stock prices change.
Investor.java: Represents the observer (investor) who gets updates.
Usage: Observers (investors) are notified of stock price changes in real-time.

2. Creational Patterns
Singleton Pattern
Logger.java: Ensures a single instance of the logger class.
Usage: Provides global access to a single logger instance.

Factory Pattern
Notification.java: Interface for notifications.
EmailNotification.java: Sends email notifications.
SMSNotification.java: Sends SMS notifications.
NotificationFactory.java: Creates instances of EmailNotification or SMSNotification.
Usage: Simplifies object creation by using the factory class to generate the required type of notification.

3. Structural Patterns
Adapter Pattern
USBPort.java: Interface for USB-C ports.
OldUSBDevice.java: Represents an old USB device.
USBtoUSBCAdapter.java: Adapter that allows an old USB device to connect to a new USB-C port.
Usage: Allows incompatible interfaces to work together.

Decorator Pattern
Order.java: Interface for basic order functionality.
BasicOrder.java: Represents a simple order.
GiftWrap.java: Decorates the order with gift wrapping functionality.
ExpeditedShipping.java: Decorates the order with expedited shipping.
Usage: Adds additional functionalities to an object dynamically at runtime.

Best Practices Followed
Exception Handling: Proper exception handling is implemented to capture potential runtime issues.
Logging: The Logger class (Singleton pattern) ensures centralized logging throughout the application.
Defensive Programming: Input validation and protection against invalid states are implemented where necessary.
Performance Optimization: Code is optimized for readability and performance by using appropriate data structures and design patterns.
Separation of Concerns: Each design pattern is implemented in its respective package, ensuring code modularity and easy maintainability.
Adherence to SOLID Principles: The project adheres to SOLID principles such as Single Responsibility, Open-Closed, and Dependency Inversion to ensure maintainable and scalable code.

Future Enhancements
Adding more design patterns such as Proxy, Builder, and Command.
Extending the project to include unit tests to validate the correctness of design pattern implementations.
