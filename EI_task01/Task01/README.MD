### Design Patterns in Java

## Overview
This project demonstrates various design patterns in Java, including behavioral, creational, and structural patterns. The code follows best practices such as logging, exception handling, defensive programming, and performance optimization.


## Design Patterns Implemented

1. Behavioral Patterns
Strategy Pattern: Handles payment via CreditCardPayment and PayPalPayment.
Observer Pattern: Investors (observers) are notified of stock price changes in StockTicker.

2. Creational Patterns
Singleton Pattern: Logger class ensures a single logging instance.
Factory Pattern: NotificationFactory dynamically creates EmailNotification or SMSNotification.

3. Structural Patterns
Adapter Pattern: USBtoUSBCAdapter allows old USB devices to connect via a USB-C port.
Decorator Pattern: Adds functionalities like GiftWrap and ExpeditedShipping to BasicOrder.

## How to Run
Prerequisites: Install JDK 11+ and Git.

1. Clone the Repository:
git clone https://github.com/your-username/DesignPatternsDemo.git

2. Navigate to the project directory:
cd DesignPatternsDemo

3. Compile the Java files:
javac -d bin src/*/.java

4. Run the Project:
java -cp bin tests.Main

## Best Practices
Exception Handling and Logging with the Singleton Logger.
Defensive Programming ensures validation.
SOLID Principles for maintainability and scalability.

