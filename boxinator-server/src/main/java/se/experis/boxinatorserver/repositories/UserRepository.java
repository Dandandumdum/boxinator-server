package se.experis.boxinatorserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.experis.boxinatorserver.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}