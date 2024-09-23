package structural;

public class BasicOrder implements Order {
    @Override
    public double getCost() {
        return 50.0;  // Base cost
    }

    @Override
    public String getDescription() {
        return "Basic Order";
    }
}
