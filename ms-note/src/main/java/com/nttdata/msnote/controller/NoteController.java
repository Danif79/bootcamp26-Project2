package com.nttdata.msnote.controller;

import com.nttdata.msnote.model.Note;
import com.nttdata.msnote.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Note> GetAllNotes(){
        return noteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createNote(@RequestBody Note note){
        noteRepository.save(note);
    }
}
