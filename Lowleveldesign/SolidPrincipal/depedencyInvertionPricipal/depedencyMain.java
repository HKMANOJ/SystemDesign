package Lowleveldesign.SolidPrincipal.depedencyInvertionPricipal;

public class depedencyMain {

    public static void main(String[] args) {
        DepedencyInver depedencyInver = new MySQL();
        Application application = new Application(depedencyInver);
        application.start();
    }
}