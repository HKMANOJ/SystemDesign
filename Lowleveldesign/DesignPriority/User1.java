package Lowleveldesign.DesignPriority;

public class User1 implements Role{
    @Override
    public void access(RoleType roleType) {
        if (roleType == RoleType.USER1) {
            System.out.println("Welcome User1 portal");
        }else {
            System.out.println("You dont have the right access for this endpoint");
        }

    }
}
