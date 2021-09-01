package se.experis.boxinatorserver.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private int weight;

    @JoinTable(
            name = "order_package",
            joinColumns = {@JoinColumn(name = "package_id")},
            inverseJoinColumns = {@JoinColumn(name = "order_id")}
    )

    @Nullable
    @ManyToMany
    public List<Order> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
