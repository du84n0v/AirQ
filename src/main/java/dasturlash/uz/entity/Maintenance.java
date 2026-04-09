package dasturlash.uz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "started_date")
    private LocalDateTime startedDate;

    @Column(name = "ended_date")
    private LocalDateTime endedDate;

    @Column(columnDefinition = "text")
    private String reason;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "technician_id")
    private Profile technician;



}
