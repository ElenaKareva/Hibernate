package com.example.hibernate.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class PersonId implements Serializable {
    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private int age;
}
