package Observer.Youtub;

public class Youtube {
    public static void main(String[] args) {


        Channel ch = new Channel();

        Subscriber s1 = new Subscriber("manoj");

        ch.subscribe(s1);

        s1.SubscribedToChannel(ch);

        ch.upload("kalamadhyama");
    }
}
