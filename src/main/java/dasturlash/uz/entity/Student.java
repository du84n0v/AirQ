package dasturlash.uz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Integer id; // primary key not null
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Integer age;
}
