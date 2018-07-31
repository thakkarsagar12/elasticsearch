package com.elasticsearch.elasticsearch.model;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document(indexName = "books",type = "books")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public class Book extends Auditable<String>{

    @Id
    private Integer id;
    private String title;
    private String author;
    private String releaseDate;

}
