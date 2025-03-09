package Lowleveldesign.SolidPrincipal.SingleResposibityPrincipal;

public class SingleRReport {
    public void generateReport(Employee employee) {
        System.out.println("Report for " + employee.getName() + " - Salary: " + employee.calculateSalary());
    }
}
