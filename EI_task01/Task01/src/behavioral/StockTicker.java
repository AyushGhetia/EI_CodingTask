package behavioral;

import java.util.ArrayList;
import java.util.List;

public class StockTicker {
    private List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double price;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, price);
        }
    }
}
