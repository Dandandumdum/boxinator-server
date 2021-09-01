package se.experis.boxinatorserver.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int multiplier;


    @Nullable
    @OneToMany
    @JoinColumn(name = "country_id")
    public List<Order> orders;

    @Nullable
    @JsonGetter("characters")
    public List<String> characters() {
        return orders.stream()
                .map(order -> {
                    return "/api/orders/" + order.getId();
                }).collect(Collectors.toList());
    }

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

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }
}