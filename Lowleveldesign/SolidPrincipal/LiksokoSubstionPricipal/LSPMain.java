package Lowleveldesign.SolidPrincipal.LiksokoSubstionPricipal;

public class LSPMain {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.eat();
        FlyingBird flyingBird = new Sparrow();
        flyingBird.fly();   
        flyingBird.eat();
    }
}   