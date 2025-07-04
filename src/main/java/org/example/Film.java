package org.example;


import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.Year;

@Entity
@Table(schema = "movie", name = "film")
public class Film {
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;


    private String title;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "release_year" , columnDefinition = "year")
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

}
