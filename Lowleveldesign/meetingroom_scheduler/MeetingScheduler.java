package Lowleveldesign.meetingroom_scheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingScheduler {

    private Calendar calendar;

    public MeetingScheduler() {
        this.calendar = new Calendar();
    }

    public Meeting scheduleMeeting(String meetingId, String title, LocalDateTime startTime, int duration, User organizer) {
        if (meetingId == null || title == null || startTime == null || organizer == null) {
            throw new IllegalArgumentException("Invalid input: All meeting details must be provided.");
        }

        if (!calendar.isTimeSlotAvailable(startTime, duration)) {
            throw new RuntimeException("Meeting time conflicts with an existing meeting.");
        }

        Meeting newMeeting = new Meeting(meetingId, title, startTime, duration, organizer);
        calendar.addMeeting(newMeeting);
        return newMeeting;
    }

    public void addParticipantToMeeting(String meetingId, User participant) {
        for (Meeting meeting : calendar.getMeetings()) {
            if (meeting.getMeetingId().equals(meetingId)) {
                meeting.addParticipant(participant);
                return;
            }
        }
        throw new RuntimeException("Meeting not found.");
    }

    public List<Meeting> listMeetings() {
        return calendar.getMeetings();
    }

}
