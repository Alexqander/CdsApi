package com.mx.cds.cdsapi.user.controller;

import com.mx.cds.cdsapi.infoperson.model.InfoPerson;
import com.mx.cds.cdsapi.role.model.Role;


public class UserDTO {
    private long id;
    private String email;
    private String password;
    private Role role;
    private InfoPerson infoPerson;

    public UserDTO() {
    }

    public UserDTO(long id, String email, String password, Role role, InfoPerson infoPerson) {
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

