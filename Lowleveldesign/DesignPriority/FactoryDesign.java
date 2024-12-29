package Lowleveldesign.DesignPriority;

public class FactoryDesign {

    public Role rolestype(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("Admin")){
            return new Admin();
        } else if (name.equalsIgnoreCase("User1")) {
            return new User1();
        }else {
            return new User2();
        }
    }
}
