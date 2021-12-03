package br.com.movie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Armchair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String letter;

    private int number;

    private Boolean vip;

    private Room room;
}
