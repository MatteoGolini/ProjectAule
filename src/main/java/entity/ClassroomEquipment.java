package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ClassroomEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long classroomEquipmentId;
    @JoinColumn
    private long classroomId;
    @JoinColumn
    private long equipmentId;
}
