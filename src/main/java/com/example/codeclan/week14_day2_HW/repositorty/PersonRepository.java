package com.example.codeclan.week14_day2_HW.repositorty;

import com.example.codeclan.week14_day2_HW.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
