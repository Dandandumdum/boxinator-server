package se.experis.boxinatorserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.experis.boxinatorserver.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
