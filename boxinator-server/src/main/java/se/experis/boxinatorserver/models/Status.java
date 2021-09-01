package se.experis.boxinatorserver.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JoinTable(
            name = "status_shipment",
            joinColumns = {@JoinColumn(name = "status_id")},
            inverseJoinColumns = {@JoinColumn(name = "shipment_id")}
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
}
