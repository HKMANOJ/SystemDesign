package Lowleveldesign.DesignPriority;

public class FactoryDesign {

    public Role createRole(RoleType roleType) {
        if (roleType == null) {
            throw new IllegalArgumentException("RoleType cannot be null");
        }
        
        switch (roleType) {
            case ADMIN:
                return new Admin();
            case USER1:
                return new User1();
            case USER2:
                return new User2();
            default:
                throw new IllegalArgumentException("Unknown role type: " + roleType);
        }
    }
}
