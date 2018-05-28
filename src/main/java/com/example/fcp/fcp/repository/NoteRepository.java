package com.example.fcp.fcp.repository;


import com.example.fcp.fcp.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Notes,Long> {
}
