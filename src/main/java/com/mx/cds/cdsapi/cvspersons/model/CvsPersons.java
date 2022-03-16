package com.mx.cds.cdsapi.cvspersons.model;

import com.mx.cds.cdsapi.infoperson.model.InfoPerson;

import javax.persistence.*;

@Entity
public class CvsPersons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "infoPerson_id")
    private InfoPerson infoPerson;


}
