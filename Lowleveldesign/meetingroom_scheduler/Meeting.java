package Lowleveldesign.meetingroom_scheduler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Meeting {


    private String meetingId;
    private String title;
    private LocalDateTime startTime;
    private int duration; // in minutes
    private List<User> participants;
    private LocalDateTime endTime;

    public Meeting(String meetingId, String title, LocalDateTime startTime, int duration, User organizer) {
        this.meetingId = meetingId;
        this.title = title;
        this.startTime = startTime;
        this.duration = duration;
        this.participants = new ArrayList<>();
        this.participants.add(organizer);
        this.endTime = startTime.plusMinutes(duration);
    }

    public boolean conflictsWith(LocalDateTime newStartTime, int newDuration) {
        LocalDateTime newEndTime = newStartTime.plusMinutes(newDuration);
        return !(this.startTime.isAfter(newEndTime) || this.endTime.isBefore(newStartTime));
    }

    public void addParticipant(User user) {
        participants.add(user);
    }

    public List<User> getParticipants() {
        return participants;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public int getDuration() {
        return duration;
}
}
