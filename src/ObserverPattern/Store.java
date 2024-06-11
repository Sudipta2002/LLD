package ObserverPattern;

import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailNotificationObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver obj1 = new EmailNotificationObserver("dcsfsfs@gmail.com",iphoneObservable);
        NotificationAlertObserver obj2 = new EmailNotificationObserver("dcsfsfs@gmail.com",iphoneObservable);
        NotificationAlertObserver obj3 = new EmailNotificationObserver("dcsfsfs@gmail.com",iphoneObservable);

        iphoneObservable.add(obj1);
        iphoneObservable.add(obj2);
        iphoneObservable.add(obj3);

        iphoneObservable.setStockCount(10);
    }
}
