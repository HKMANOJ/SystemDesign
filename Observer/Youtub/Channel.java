package Observer.Youtub;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Task{
    List<Subscriber> sd=new ArrayList<>();
    String title;
    @Override
    public void subscribe(Subscriber sub) {
        sd.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub) {
sd.remove(sub);
    }

    @Override
    public void Notify() {
    for (Subscriber sub:sd){
        sub.update();
    }
    }

    @Override
    public void upload(String title) {
    this.title=title;
    Notify();
    }
}
