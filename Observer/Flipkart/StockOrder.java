package Observer.Flipkart;

public interface StockOrder {

    public void NotifySubscriber();



    void DltSubscriber(EmailNotification sub);

    public void StockCount(int count);



    void add(EmailNotification sub);

    public int getCount();
}
