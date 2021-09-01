package se.experis.boxinatorserver.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String totalCost;
    private String color;

    @ManyToOne
    @JoinColumn(name = "country_id")
    public Country country;

    @JoinTable (
            name = "package_order",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "package_id")}
    )

    @ManyToMany
    public List<Package> packages;

    @OneToOne
    @JoinColumn(name = "shipment_id")
    private Shipment shipment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
