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

public class Section extends BaseEntity{
//    @Id
//    @GeneratedValue
//    private Integer id; // cause, it's already on the BaseEntity

    private String name;
    private int sectionOrder;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;

    @OneToMany(mappedBy = "sections")
    private List<Lecture> lectures;
}
