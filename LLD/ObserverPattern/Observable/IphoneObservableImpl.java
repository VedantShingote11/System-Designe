package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> ls = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        ls.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        ls.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationAlertObserver observer : ls) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (newStockAdded == 0) return;
        if (stockCount == 0) notifySubscriber();
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
