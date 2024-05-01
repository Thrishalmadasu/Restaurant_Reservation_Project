package com.sst.restaurant_reservation_project.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne

    private Customer customer;

    private Long tableId;

    private Long numberOfGuests;

    private Date reservationDate;

    private Date reservationTime;

    public Reservation() {

    }

    public Reservation (Long id, Customer customer, Long tableId, Long numberOfGuests, Date reservationDate, Date reservationTime) {
        this.id = id;
        this.customer = customer;
        this.tableId = tableId;
        this.numberOfGuests = numberOfGuests;
        this.reservationDate = reservationDate;
        this.reservationTime = reservationTime;
    }

}