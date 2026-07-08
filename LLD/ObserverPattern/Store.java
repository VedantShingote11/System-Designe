package ObserverPattern;
import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StockObservable;
import ObserverPattern.Observer.EmailAlertOberverImp;
import ObserverPattern.Observer.MobileAlerObserverImp;
import ObserverPattern.Observer.NotificationAlertObserver;


public class Store {
    public static void main(String[] args) {
        
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlerObserverImp("1234567890", iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertOberverImp("user@example.com", iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);

        iphoneObservable.setStockCount(10);
    }
}
