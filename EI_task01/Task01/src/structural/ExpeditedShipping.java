package structural;

public class ExpeditedShipping implements Order {
    private Order order;

    public ExpeditedShipping(Order order) {
        this.order = order;
    }

    @Override
    public double getCost() {
        return order.getCost() + 20.0;  // Adding expedited shipping cost
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ", Expedited Shipping";
    }
}
