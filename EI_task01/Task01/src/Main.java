import behavioral.*;
import creational.*;
import structural.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Strategy Pattern : ");
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.setPaymentMethod(new CreditCardPayment("9988-7766-5522"));
        paymentProcessor.processPayment(1000.0);
        paymentProcessor.setPaymentMethod(new PayPalPayment("ayush@gmail.com"));
        paymentProcessor.processPayment(1000.0);
        System.out.println();

        System.out.println("Test Observer Pattern : ");
        StockTicker stockTicker = new StockTicker();
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");
        stockTicker.addObserver(investor1);
        stockTicker.addObserver(investor2);
        stockTicker.setPrice("AAPL", 152.43);
        System.out.println();

        System.out.println("Test Singleton Pattern : ");
        Logger logger = Logger.getInstance();
        logger.log("Application started");
        System.out.println();

        System.out.println("Test Factory Pattern : ");
        NotificationFactory factory = new NotificationFactory();
        Notification emailNotification = factory.createNotification("email");
        emailNotification.send("Hello, this is an email!");
        System.out.println();

        System.out.println("Test Adapter Pattern");
        OldUSBDevice oldDevice = new OldUSBDevice();
        USBPort adapter = new USBtoUSB_CAdapter(oldDevice);
        adapter.connectWithUsbCable();
        System.out.println();

        System.out.println("Test Decorator Pattern");
        Order order = new BasicOrder();
        order = new GiftWrap(order);
        order = new ExpeditedShipping(order);
        System.out.println(order.getDescription() + " costs: $" + order.getCost());
    }
}