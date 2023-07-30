package org.haileab.waaaug2023springdata.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id @GeneratedValue
    private int id;
    private String comment;
    @ManyToOne
    private Product product;
    @ManyToOne
    private User user;
}
