package dasturlash.uz.entity;

import javax.persistence.*;

@Entity
public class Pollutant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;
}
