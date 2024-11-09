package com.mugiwarapirates.jpa.model;
import com.mugiwarapirates.jpa.JpaApplication;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Table(name = "zoro_table")
public class Author extends BaseEntity{
    @Id
    @GeneratedValue
            /*(
            strategy = GenerationType.TABLE,
            generator = "author_id_gen"
    )*/

    /*@SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )*/
    /*@TableGenerator(
            name = "author_sequence",
            table = "id_generator",
            pkColumnName = "id_name",
            pkColumnValue = "id_value",
            allocationSize = 1

    )*/

    private Integer id;
//    @Column(name = "f_name", length = 35)
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private Integer age;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses; // This is the inverse of the relationship. it has a ManyToMany with Course.java


//    @Column(updatable = false, nullable = false)
//    private LocalDateTime createdAt;
//    @Column(insertable = false)
//    private LocalDateTime lastModified;
}
