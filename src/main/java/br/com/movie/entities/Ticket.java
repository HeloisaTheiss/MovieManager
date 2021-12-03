package br.com.movie.entities;

import br.com.movie.entities.enums.PayType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Poster poster;

    private Armchair armchair;

    private String cpf;

    private double price;

    private DiscountType discountType;

    private double payValue;

    private PayType pay;

    private LocalDate date;
}
