package com.example.codeclan.week14_day2_HW.repositorty;

import com.example.codeclan.week14_day2_HW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
