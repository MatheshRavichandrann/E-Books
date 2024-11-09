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
public class Lecture extends BaseEntity{
//    @Id
//    @GeneratedValue
//    private Integer id; // cause, it's already on the BaseEntity

    private String name;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section sections;

    @OneToOne
    @JoinColumn(name = "resource_id")
    private Resources resources;
}
