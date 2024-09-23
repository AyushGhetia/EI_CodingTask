package behavioral;

public class Investor implements Observer {
    private String investorName;

    public Investor(String name) {
        this.investorName = name;
    }

    public void update(String stockSymbol, double price) {
        System.out.println("Investor " + investorName + " notified. Stock: " + stockSymbol + ", New Price: " + price);
    }
}
