package Lowleveldesign.DesignPriority;

public class main {
    public static void main(String[] args) {
        FactoryDesign factoryDesign= new FactoryDesign();
        Role role=factoryDesign.createRole(RoleType.ADMIN);
        role.access(RoleType.ADMIN);
        role.access(RoleType.USER1);
    }
}
