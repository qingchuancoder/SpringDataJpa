package org.example.springdatajpa.repository;

import org.example.springdatajpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
