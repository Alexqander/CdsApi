package com.mx.cds.cdsapi.projects.model;

import com.mx.cds.cdsapi.status.model.Status;

import javax.persistence.*;

@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String progress;
    private String dateCreated;
    private String deliverDate;
    private String finalDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;



}
