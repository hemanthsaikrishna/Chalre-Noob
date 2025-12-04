package com.jspiders;

import com.jspiders.project.bms.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name="auditorium")

public class Address extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="street", nullable=false)
    private String street;
    @Column(name="area", nullable=false)
    private String area;
    @Column(name="city",nullable = false)
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
