package br.com.movie.entities;

import org.apache.tomcat.jni.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Poster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Movie movie;

    private LocalDate date;

    private Time hour;

    private Room room;
}
