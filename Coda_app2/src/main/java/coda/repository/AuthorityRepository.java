package coda.repository;

import coda.model.Authority;
import coda.model.Authority2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Authority2> {

    Optional<Authority> findByName(Authority2 authority);
}
