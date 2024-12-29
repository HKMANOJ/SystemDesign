package Observer.Flipkart;

import java.util.ArrayList;

public class Subscribe implements StockOrder{
    ArrayList<EmailNotification> sd = new ArrayList<>();
    int stockCount=0;

//        String emailId;
//
//    public Subscribe(String emailId) {
//        this.emailId = emailId;
//    }

    private EmailNotification call;
    @Override
    public void NotifySubscriber() {

        for (EmailNotification sub:sd){
            sub.update();
            sub.sendEmail();
        }
    }


    @Override
    public void DltSubscriber(EmailNotification sub) {
        sd.remove(sub);
    }

    @Override
    public void StockCount(int count) {
        if(count>0){
            NotifySubscriber();
        }
        stockCount+=count;
    }



    @Override
    public void add(EmailNotification sub) {
        sd.add(sub);
    }

    @Override
    public int getCount() {
        return stockCount;
    }
}
