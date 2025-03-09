package Lowleveldesign.SolidPrincipal.LiksokoSubstionPricipal;

public interface Bird {
    void eat();
}

class Sparrow implements FlyingBird {
    @Override
        public void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin implements Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is Eating");
    }
}