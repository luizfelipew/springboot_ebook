package com.springboot.greendogdelivery.springbootgreendogdelivery.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = true)
    private Cliente cliente;

    @ManyToMany
    @Cascade(CascadeType.MERGE)
    private List<Item> itens;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date data;
    @Min(1)
    private Double valorTotal;

}
