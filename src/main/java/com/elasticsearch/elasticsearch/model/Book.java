package com.elasticsearch.elasticsearch.model;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;

@Document(indexName = "books",type = "books")
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table
public class Book{

    @Id
    private Integer id;
    private String title;
    private String author;
    private String releaseDate;
//
//    @CreatedBy
//    @Column(nullable = false, updatable = false)
//    private String createdBy;
//
//    @CreatedDate
//    @Column(nullable = false, updatable = false)
//    private LocalDateTime created;
//
//    @LastModifiedBy
//    @Column(nullable = false)
//    private String modifiedBy;
//
//    @LastModifiedDate
//    @Column(nullable = false)
//    private LocalDateTime modified;
}
