package com.alpha.springy.springy.DAO;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tester {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;

    public Tester() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
