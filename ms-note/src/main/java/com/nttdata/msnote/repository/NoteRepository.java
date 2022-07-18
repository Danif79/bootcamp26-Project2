package com.nttdata.msnote.repository;

import com.nttdata.msnote.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends MongoRepository<Note, String> {
}
