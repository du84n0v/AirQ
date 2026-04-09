package dasturlash.uz.entity;

import javax.persistence.*;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String sensorCode;

    @Column
    private String sensorName;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "pollutant_id")
    private Pollutant pollutant;
}
