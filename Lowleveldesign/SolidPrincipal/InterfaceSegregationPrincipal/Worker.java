package Lowleveldesign.SolidPrincipal.InterfaceSegregationPrincipal;

public interface Worker {
    void work();

}

class FullTimeWorker implements Worker, Eat {
    @Override
    public void work() {
        System.out.println("Full Time Worker is working");
    }

    @Override
    public void eat() {
        System.out.println("Full Time Worker is eating");
    }
}






