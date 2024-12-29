package Observer.Youtub;

public interface Task {

    void subscribe(Subscriber sub);
    void unSubscribe(Subscriber sub);

    void Notify();

    void upload(String title);
}
