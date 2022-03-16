package com.mx.cds.cdsapi.address.model;

import com.mx.cds.cdsapi.infoperson.model.InfoPerson;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String street;
    private int extNumber;
    private int indoorNumber;
    private String suburb;
    private int postalCode;
    private String town;
    private String estate;
    @OneToOne
    @JoinColumn(name = "infoPerson_id")
    private InfoPerson infoPerson;
}
