package se.experis.boxinatorserver.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "shipment")
    private Order order;

    @JoinTable (
            name = "status_shipment",
            joinColumns = {@JoinColumn(name = "shipment_id")},
            inverseJoinColumns = {@JoinColumn(name = "status_id")}
    )

    @ManyToMany
    public List<Status> statuses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
