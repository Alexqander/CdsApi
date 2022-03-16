package com.mx.cds.cdsapi.user.model;

import com.mx.cds.cdsapi.infoperson.model.InfoPerson;
import com.mx.cds.cdsapi.role.model.Role;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "email",unique = true)
    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToOne(mappedBy = "user")

    private InfoPerson infoPerson;

    public User() {
    }

    public User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public User(long id, String email, String password, Role role, InfoPerson infoPerson) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.infoPerson = infoPerson;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public InfoPerson getInfoPerson() {
        return infoPerson;
    }

    public void setInfoPerson(InfoPerson infoPerson) {
        this.infoPerson = infoPerson;
    }
}
