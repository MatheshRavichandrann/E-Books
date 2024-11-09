package com.mugiwarapirates.jpa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Course extends BaseEntity{
//    @Id
//    @GeneratedValue // cause, it's already on the BaseEntity
//    private Integer id;

    private String title;
    private String description;
    @ManyToMany
    @JoinTable(name = "authors_courses", joinColumns = {@JoinColumn(name = "course_id")}, inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors; // This is the owner of the relationship. it has a ManyToMany with Author.java

    @OneToMany(mappedBy = "courses")
    private List<Section> sections;

}
