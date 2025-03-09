package Lowleveldesign.SolidPrincipal.Open;

import Lowleveldesign.SolidPrincipal.Open.ClosedPrincipal.Notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
