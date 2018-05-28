package com.example.fcp.fcp;

import com.example.fcp.fcp.model.Notes;
import org.springframework.web.bind.annotation.*;
import com.example.fcp.fcp.repository.NoteRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    NoteRepository notesRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(1,
                String.format(template, name));
    }


}
