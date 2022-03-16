package com.mx.cds.cdsapi.cvspersons.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CvsPersonsRepository extends JpaRepository<CvsPersons,Long> {
    Optional<CvsPersons>findByname(String name);
    boolean existsById(long id);
}
