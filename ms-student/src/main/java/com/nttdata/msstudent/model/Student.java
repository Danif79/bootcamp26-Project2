package com.nttdata.msstudent.model;

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
public class Student {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int years;

    private String courseId;
}
