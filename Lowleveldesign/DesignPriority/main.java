package Lowleveldesign.DesignPriority;

public class main {
    public static void main(String[] args) {
        FactoryDesign factoryDesign= new FactoryDesign();


        Role role=factoryDesign.rolestype("Admin");
        role.access("role");

    }
}
