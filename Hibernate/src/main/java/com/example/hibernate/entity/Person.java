package com.example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PERSONS")
public class Person implements Serializable {
    @EmbeddedId
    private PersonId personId;

    @Column
    private String phoneNumber;

    @Column
    private String cityOfLiving;
}
