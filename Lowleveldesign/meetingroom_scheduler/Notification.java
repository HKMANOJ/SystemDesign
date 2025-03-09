package Lowleveldesign.meetingroom_scheduler;

public interface Notification {
    void sendReminder(User user, Meeting meeting);
}

// Default console-based implementation
class ConsoleNotification implements Notification {
    @Override
    public void sendReminder(User user, Meeting meeting) {
        System.out.println("Reminder sent to " + user.getName() + " for meeting: " + meeting.getMeetingId());
    }
}
