package Lowleveldesign.SolidPrincipal.depedencyInvertionPricipal;

public class Application {
    private DepedencyInver depedencyInver;

    public Application(DepedencyInver depedencyInver) {
        this.depedencyInver = depedencyInver;
    }   

   void start() {
    depedencyInver.connect();
   }
    
    
}
