package com.example.server.model;

import javax.persistence.*;

@Entity
@Table(name = "planets")
public class Planet {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String color;

    @Column
    private Long distance_from_sun;

    @Column
    private Long size;

    public Planet() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Long getDistance() {
        return distance_from_sun;
    }
    public void setDistance(Long distance) {
        this.distance_from_sun = distance;
    }

    public Long getSize() {
        return size;
    }
    public void setSize(Long size) {
        this.size = size;
    }
}
