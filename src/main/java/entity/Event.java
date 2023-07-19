package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String eventId;
    private String description;
    private Date eventDate;
    private Time startTime;
    private Time endTime;
    private EventType eventType;
    private Recurrence recurrence;
    private Date endRecurrence;
    @JoinColumn
    private long responsibleId;
    @JoinColumn
    private long classroomId;
    @JoinColumn
    private long courseId;

}
