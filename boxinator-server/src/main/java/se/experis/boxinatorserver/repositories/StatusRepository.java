package se.experis.boxinatorserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.experis.boxinatorserver.models.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status,Long> {
}
