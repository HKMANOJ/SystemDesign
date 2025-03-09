package Lowleveldesign.SolidPrincipal.SingleResposibityPrincipal;

public class SingleReMain {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("John", 5000);
        Employee contractEmployee = new ContractEmployee("Jane", 100, 40);


        SingleRReport report = new SingleRReport();
        report.generateReport(fullTimeEmployee);
        report.generateReport(contractEmployee);
    }
}   