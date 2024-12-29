package Lowleveldesign.meetingroom_scheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Meeting> meetings;

    public Calendar() {

        this.meetings = new ArrayList<>();
    }

    public boolean isTimeSlotAvailable(LocalDateTime startTime, int duration) {
        for (Meeting meeting : meetings) {
            if (meeting.conflictsWith(startTime, duration)) {
                return false;
            }
        }
        return true;
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void cancelMeeting(String meetingId) {
        meetings.removeIf(meeting -> meeting.getMeetingId().equals(meetingId));
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }

}
