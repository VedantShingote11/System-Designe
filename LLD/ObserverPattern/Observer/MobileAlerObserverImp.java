package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class MobileAlerObserverImp implements NotificationAlertObserver {

    String mobile;
    StockObservable observable;

    public MobileAlerObserverImp(String mobile, StockObservable observable) {
        this.mobile = mobile;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSMS(mobile, observable.getStockCount());
    }

    public void sendSMS(String mobile, int stockCount) {
        System.out.println("Sending SMS to " + mobile + " with stock count " + stockCount);
    }
}
