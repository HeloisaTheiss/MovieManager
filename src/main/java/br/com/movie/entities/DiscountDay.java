package br.com.movie.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DiscountDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int dayWeek;

    private Boolean activeDiscount;

    private double discountPercentage;

}
