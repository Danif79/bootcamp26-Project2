package com.nttdata.msnote.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="student")
@Getter
@Setter
@NoArgsConstructor
@Data
public class Note {
    @Id
    private String note;

    private String courseId;
    private String studentId;
}
