package org.haileab.waaaug2023springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {
    @Id @GeneratedValue
    private int id;
    private String street;
    private int zip;
    private String city;
    @OneToOne(mappedBy = "address")
    private User user;
}
