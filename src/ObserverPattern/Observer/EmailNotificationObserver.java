package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{

    private String EmailId;
    StocksObservable observable;
    public EmailNotificationObserver(String emailId,StocksObservable observable){
        this.EmailId=emailId;
        this.observable=observable;
    }

    @Override
    public void update() {
        sendMail(this.EmailId,"Sent to mail to ");
    }
    private void sendMail(String emailId,String msg){
        System.out.println(msg+" "+emailId);
    }
}
