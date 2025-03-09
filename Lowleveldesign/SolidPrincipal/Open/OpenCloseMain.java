package Lowleveldesign.SolidPrincipal.Open;

import Lowleveldesign.SolidPrincipal.Open.ClosedPrincipal.Notification;

public class OpenCloseMain {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        //Notification smsNotification = new SmsNotification();

        emailNotification.sendNotification("Open Close Principle");
        //smsNotification.sendNotification("Hello, world!");
    }
}
