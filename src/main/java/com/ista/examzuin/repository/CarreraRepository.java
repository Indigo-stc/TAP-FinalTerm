package com.ista.examzuin.repository;

import com.ista.examzuin.entity.Carrera;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends MongoRepository<Carrera, Long> {
}
