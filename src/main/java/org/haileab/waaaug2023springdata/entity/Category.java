package org.haileab.waaaug2023springdata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

    public void setProducts(List<Product> products) {
        this.products = products;
        this.products.forEach((p)-> p.setCategory(this));
        System.out.println("USED SetProdcuts");
    }
}
