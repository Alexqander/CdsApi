package com.mx.cds.cdsapi.infoperson.model;

import com.mx.cds.cdsapi.address.model.Address;
import com.mx.cds.cdsapi.cvspersons.model.CvsPersons;
import com.mx.cds.cdsapi.status.model.Status;

import javax.persistence.*;

@Entity
public class InfoPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String personalEmail;
    private String academicEmail;
    private int telephone;
    private int Cellphone;
    private String name;
    private String lastName;
    private String mothersLastname;
    //relacion con la direccion


    @OneToOne(mappedBy = "infoPerson")
    private Address address;

    //-----------------------------

    private String school;
    private String academicLevel;
    private String SchoolDni;
    private String applications;
    private String secondApplications;

    //Estados-------------------------

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;


    //--------


    //cvsPersons----------------------

    @OneToOne(mappedBy = "infoperson")
    private CvsPersons cvsPersons;

    //--------------------------------

}
