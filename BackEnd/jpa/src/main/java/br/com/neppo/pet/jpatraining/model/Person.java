package br.com.neppo.pet.jpatraining.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table( name = "PERSON" )
public class Person implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "NAME" )
    private String name;

    @Column( name = "BIRTH" )
    private Date birth;

    @ManyToMany( mappedBy = "persons" )
    private List< Car > cars;
}
