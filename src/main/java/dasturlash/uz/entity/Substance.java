package dasturlash.uz.entity;

import javax.persistence.*;

@Entity
public class Substance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String code;

    @Column
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column
    private String measurementUnit;

    @Column
    private String reason;
}
