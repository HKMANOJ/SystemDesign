package Lowleveldesign.DesignPriority;

public class Admin implements Role {
    @Override
    public void access(RoleType roleType) {
        if (roleType == RoleType.ADMIN) {
            System.out.println("Welcome Admin portal");
        } else {
            System.out.println("You dont have the right access for this endpoint");
        }
    }
}
