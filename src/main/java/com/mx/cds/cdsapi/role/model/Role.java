package com.mx.cds.cdsapi.role.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mx.cds.cdsapi.user.model.User;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String description;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<User>users;

}
