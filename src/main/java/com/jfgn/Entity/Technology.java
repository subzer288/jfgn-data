package com.jfgn.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "technologies")
public class Technology {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int value;

    @OneToOne
    @JoinColumn(name = "id_type_technologies")
    private TypeTechnology typeTechnology;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TypeTechnology getTypeTechnology() {
        return typeTechnology;
    }

    public void setTypeTechnology(TypeTechnology typeTechnology) {
        this.typeTechnology = typeTechnology;
    }
}
