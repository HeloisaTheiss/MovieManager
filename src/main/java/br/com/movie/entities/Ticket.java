package br.com.movie.entities;

import br.com.movie.entities.enums.PayType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.CascadeType.REFRESH;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = REFRESH)
    private Poster poster;

    @ManyToOne(cascade = REFRESH)
    private Armchair armchair;

    private String cpf;

    private double price;

    @ManyToOne(cascade = REFRESH)
    private DiscountType discountType;

    private double payValue;

    @ManyToOne(cascade = REFRESH)
    private PayType pay;

    private LocalDate date;
}
