package se.experis.boxinatorserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.experis.boxinatorserver.models.Package;

@Repository
public interface PackageRepository extends JpaRepository<Package,Long> {
}
