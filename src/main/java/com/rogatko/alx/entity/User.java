package com.rogatko.alx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Getter
    @Setter
    public String name;
    public String surname;
    public long id;
    public String departmen;
    public int departmenCode;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
