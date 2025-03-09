package Lowleveldesign.meetingroom_scheduler;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize services
        Notification notificationService = new ConsoleNotification();
        MeetingScheduler meetingScheduler = new MeetingScheduler();

        // Create users
        User user1 = new User("1", "Alice");
        User user2 = new User("2", "Bob");

        System.out.println("\n=== Scheduling Meetings ===");
        
        // Schedule first meeting
        try {
            Meeting meeting1 = meetingScheduler.scheduleMeeting(
                "m1", 
                "Team Sync", 
                LocalDateTime.of(2024, 12, 11, 10, 0), 
                60, 
                user1
            );
            System.out.println("Meeting scheduled successfully: " + meeting1.getMeetingId());
            
            // Add participant
            meetingScheduler.addParticipantToMeeting("m1", user2);
            System.out.println("Participants in meeting m1: " + meeting1.getParticipants());
            
            // Send notifications
            for (User participant : meeting1.getParticipants()) {
                notificationService.sendReminder(participant, meeting1);
            }
        } catch (RuntimeException e) {
            System.out.println("Error scheduling meeting 1: " + e.getMessage());
        }

        System.out.println("\n=== Attempting to Schedule Conflicting Meeting ===");
        
        // Try scheduling conflicting meeting
        try {
            Meeting meeting2 = meetingScheduler.scheduleMeeting(
                "m2", 
                "Client Call", 
                LocalDateTime.of(2024, 12, 11, 11, 30), 
                30, 
                user1
            );
            System.out.println("Meeting scheduled successfully: " + meeting2.getMeetingId());
            meetingScheduler.addParticipantToMeeting("m2", user2);
        } catch (RuntimeException e) {
            System.out.println("Error scheduling meeting 2: " + e.getMessage());
        }

        System.out.println("\n=== All Scheduled Meetings ===");
        
        // Display all meetings
        List<Meeting> meetings = meetingScheduler.listMeetings();
        if (meetings.isEmpty()) {
            System.out.println("No meetings scheduled.");
        } else {
            for (Meeting meeting : meetings) {
                System.out.println("Meeting ID: " + meeting.getMeetingId() + ", Participants: " + meeting.getParticipants().size());
            }
        }
    }
}