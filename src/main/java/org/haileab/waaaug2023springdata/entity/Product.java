package org.haileab.waaaug2023springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.mapping.Selectable;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    @Id @GeneratedValue
    private int id;
    private String name;
    private double price;
    private double rating;
    @ManyToOne
    @JsonIgnore
    private Category category;

    @OneToMany(mappedBy = "product")
//    @Fetch(FetchMode.JOIN)
    List<Review> reviews;
}
