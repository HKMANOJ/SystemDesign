package Factory_Design;

public class Getplan {


    public Plan getplaPlan(String str) {

        if(str==null) {
            return null;
        }
        if(str.equalsIgnoreCase("Dom")) {
            return new Domestic();
        }
        else if(str.equalsIgnoreCase("COM")) {
            return new Commercial();
        }
        return null;

    }


}
