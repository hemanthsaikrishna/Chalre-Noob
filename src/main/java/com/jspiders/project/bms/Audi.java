package com.jspiders.project.bms;


import com.jspiders.Address;
import jakarta.persistence.*;

@Entity
@Table(name="auditorium")
public class Audi {
    @Id
    private Long id;
    @Column(name="audi_name",nullable = false)
    private String name;
    @Column(name="seat_name",nullable = false)
    private String seatRows;
    @Column(name="seat_column",nullable = false)
    private Integer seatcolumn;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addrs_id")//FK
    private Address address;


    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(String seatRows) {
        this.seatRows = seatRows;
    }

    public Integer getSeatcolumn() {
        return seatcolumn;
    }

    public void setSeatcolumn(Integer seatcolumn) {
        this.seatcolumn = seatcolumn;
    }
}
