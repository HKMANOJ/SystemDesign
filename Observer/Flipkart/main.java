package Observer.Flipkart;

public class main {
    public static void main(String[] args) {
        EmailNotification notify =new EmailNotification("hkmanoj@gmail.com");

        Subscribe s =new Subscribe();
        s.add(notify);
        s.StockCount(10);
        System.out.println(s.getCount());


    }
}
