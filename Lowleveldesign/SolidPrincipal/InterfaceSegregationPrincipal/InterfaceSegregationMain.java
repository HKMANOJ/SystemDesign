package Lowleveldesign.SolidPrincipal.InterfaceSegregationPrincipal;

public class InterfaceSegregationMain {
    public static void main(String[] args) {
        Worker worker = new FullTimeWorker();
        worker.work();
        Eat workerEat = new FullTimeWorker();
        workerEat.eat();
        
     Worker robot = new Roboting();
     robot.work();
    }
}   