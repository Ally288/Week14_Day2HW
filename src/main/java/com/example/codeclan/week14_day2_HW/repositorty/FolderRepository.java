package com.example.codeclan.week14_day2_HW.repositorty;

import com.example.codeclan.week14_day2_HW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
