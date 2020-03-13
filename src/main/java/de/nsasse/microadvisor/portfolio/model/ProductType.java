package de.nsasse.microadvisor.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "TYPE")
    private String type;

//    @OneToMany
//    private List<Product> products;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
