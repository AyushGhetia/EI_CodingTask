package structural;

public class GiftWrap implements Order {
    private Order order;

    public GiftWrap(Order order) {
        this.order = order;
    }

    @Override
    public double getCost() {
        return order.getCost() + 5.0;  // Adding gift wrap cost
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", Gift Wrapped";
    }
}
