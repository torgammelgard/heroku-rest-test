package se.torgammelgard.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
