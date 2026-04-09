package dasturlash.uz.entity;

import javax.persistence.*;

@Entity
public class Analyst {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
