package Lowleveldesign.meetingroom_scheduler;

public class Notification {

    public void sendReminder(User user, Meeting meeting) {
        System.out.println("Reminder sent to " + user.getName() + " for meeting: " + meeting.getMeetingId());
    }
}
