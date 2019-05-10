package br.com.neppo.pet.jpatraining.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "CATEGORY" )
public class Category implements Serializable {

    @Id
    @Column( name = "ID" )
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( name = "NAME" )
    private String name;

    @Column( name = "DESCRIPTION" )
    private String description;

    public Long getId() {
        return id;
    }

    public Category setId( Long id ) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName( String name ) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription( String description ) {
        this.description = description;
        return this;
    }
}
