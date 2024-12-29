package Lowleveldesign.meetingroom_scheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("1", "Alice");
        User user2 = new User("2", "Bob");

        // Initialize MeetingScheduler
        MeetingScheduler meetingScheduler = new MeetingScheduler();

        // Schedule the first meeting
        Meeting meeting1 = meetingScheduler.scheduleMeeting(
                "m1", "Team Sync", LocalDateTime.of(2024, 12, 11, 10, 0), 60, user1
        );
        System.out.println("Meeting scheduled: " + meeting1.getMeetingId());

        // Add a participant to the meeting
        meetingScheduler.addParticipantToMeeting("m1", user2);

        System.out.println(meeting1.getParticipants());

        // Try to schedule a conflicting meeting
        try {
            meetingScheduler.scheduleMeeting(
                    "m2", "Client Call", LocalDateTime.of(2024, 12, 11, 10, 30), 30, user1
            );
        } catch (RuntimeException e) {
            System.out.println("Conflict detected: " + e.getMessage());
        }

        // Print all scheduled meetings
        for (Meeting meeting : meetingScheduler.listMeetings()) {
            System.out.println("Meeting ID: " + meeting.getMeetingId() + ", Participants: " + meeting.getParticipants().size());
        }

        // Send a notification
        Notification notification = new Notification();
        notification.sendReminder(user1, meeting1);
    }
}