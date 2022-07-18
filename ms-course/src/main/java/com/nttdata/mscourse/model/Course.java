package com.nttdata.mscourse.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="course")
@Getter
@Setter
@NoArgsConstructor
@Data
public class Course {
    @Id
    private String id;
    private String name;
}
