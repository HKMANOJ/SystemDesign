package Lowleveldesign.DesignPriority;

public class User2 implements Role{
    @Override
    public void access(RoleType roleType) {
        if (roleType == RoleType.USER2) {
            System.out.println("Welcome User2 portal");
        }else {
            System.out.println("You dont have the right access for this endpoint");
        }

    }
}
