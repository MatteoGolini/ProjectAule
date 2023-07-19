package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classroomId;
    private String name;
    private int capacity;
    private String location;
    private String building;
    private int floor;
    private String responsibleEmail;
    private String notes;
    private int electricalOutletsNumber;
    private int networkOutletsNumber;
    @JoinColumn
    private long groupId;
}
