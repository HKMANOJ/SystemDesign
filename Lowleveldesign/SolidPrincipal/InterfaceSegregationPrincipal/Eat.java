package Lowleveldesign.SolidPrincipal.InterfaceSegregationPrincipal;

public interface Eat {
    void eat(); 
}


class Roboting implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}
