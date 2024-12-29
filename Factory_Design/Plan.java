package Factory_Design;

public abstract class Plan {

    protected double rate;

    public void getRate() {

    }

    public void calculateBill(int units){
        System.out.println(units*rate);
    }

}
