package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservable;

public class EmailAlertOberverImp implements NotificationAlertObserver {

    String email;
    StockObservable observable;

    public EmailAlertOberverImp(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email, observable.getStockCount());
    }

    public void sendEmail(String email, int stockCount) {
        System.out.println("Sending Email to " + email + " with stock count " + stockCount);
    }
}
