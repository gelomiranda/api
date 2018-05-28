package com.example.fcp.fcp.controller;


import com.example.fcp.fcp.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.fcp.fcp.model.Notes;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    @Autowired
    NoteRepository notesRepository;

    // Get All Notes
    @GetMapping("/notes")
    public List<Notes> getAllNotes() {
        return notesRepository.findAll();
    }

}
