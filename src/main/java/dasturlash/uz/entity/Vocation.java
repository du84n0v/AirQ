package dasturlash.uz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vocation")
public class Vocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
