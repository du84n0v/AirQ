package dasturlash.uz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double value;

    @Column(name = "collected_date")
    private LocalDateTime collectedDate;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;
}
