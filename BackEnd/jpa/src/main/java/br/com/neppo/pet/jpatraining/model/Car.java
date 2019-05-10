package br.com.neppo.pet.jpatraining.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "CAR" )
public class Car implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "BRAND" )
    private String brand;

    @Column( name = "MODEL" )
    private String model;

    @OneToOne
    @JoinColumn( name = "MOTOR_ID", nullable = false )
    private Motor motor;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "CATEGORY_ID", nullable = false )
    private Category category;

    @ManyToMany
    @JoinTable( name = "CAR_PERSON",
        joinColumns = @JoinColumn( name = "CAR_ID" ),
        inverseJoinColumns = @JoinColumn( name = "PERSON_ID" )
    )
    private List< Person > persons;

    public Long getId() {
        return id;
    }

    public Car setId( Long id ) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand( String brand ) {
        this.brand = brand;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel( String model ) {
        this.model = model;
        return this;
    }

    public Motor getMotor() {
        return motor;
    }

    public Car setMotor( Motor motor ) {
        this.motor = motor;
        return this;
    }
}
