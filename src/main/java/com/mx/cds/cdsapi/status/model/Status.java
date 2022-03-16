package com.mx.cds.cdsapi.status.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mx.cds.cdsapi.infoperson.model.InfoPerson;
import com.mx.cds.cdsapi.projects.model.Projects;

import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long description;
    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<InfoPerson> infopersons;

    @OneToMany(mappedBy = "status")
    @JsonIgnore
    private List<Projects>projects;



}
