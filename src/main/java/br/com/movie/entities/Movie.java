package br.com.movie.entities;

import br.com.movie.entities.enums.Category;
import br.com.movie.entities.enums.Language;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private String synopsis;

    private Category category;

    private int ageGroup;

    private Language linguage;

    private int duration;

}
