package br.com.movie.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.CascadeType.REFRESH;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Armchair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String letter;

    private int number;

    private Boolean vip;

    @ManyToOne(cascade = REFRESH)
    private Room room;

}
