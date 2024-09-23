package behavioral;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentMethod(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy != null) {
            strategy.pay(amount);
        } else {
            throw new IllegalStateException("No payment method is set");
        }
    }
}
