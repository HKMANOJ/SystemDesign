package Observer.Youtub;

public class Subscriber {

    private String name;

    Channel c=new Channel();

    public Subscriber(String name) {
        this.name=name;
    }

    public void SubscribedToChannel(Channel ch){
        c=ch;
    }
    public void update(){
        System.out.println("New Subscriber "+name+" has subscribed to channel"+" " +c.title);
    }
}
