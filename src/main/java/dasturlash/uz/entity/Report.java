package dasturlash.uz.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String code;

    @Column(name = "reported_date")
    private LocalDateTime reported_date;
}
