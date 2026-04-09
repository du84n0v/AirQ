package dasturlash.uz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Substance {
    @Id
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
