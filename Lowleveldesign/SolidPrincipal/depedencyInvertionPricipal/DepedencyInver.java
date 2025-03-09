package Lowleveldesign.SolidPrincipal.depedencyInvertionPricipal;

public interface DepedencyInver {
    void connect(); 
}

class MySQL implements DepedencyInver {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL");
    }
}

class Oracle implements DepedencyInver {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle");
    }
}