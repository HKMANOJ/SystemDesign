package Factory_Design;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Getplan get=new Getplan();
        System.out.println("Enter the plan to generte the bill");

        Scanner sc = new Scanner(System.in);
        String planName =sc.nextLine();

        System.out.println("Enter the units");
        int units =Integer.parseInt(sc.nextLine());
            Plan p= get.getplaPlan(planName);
           // get.getplaPlan(planName);
        System.out.println("Bill amount For"+planName+" of"+units+" is");
        p.getRate();
        p.calculateBill(units);
    }
}
