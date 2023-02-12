package com.GestionDe.Livraison.models;

import javax.persistence.*;

@Entity
@Table(name="Entrepreneur")

public class Entrepreneur {
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "preNom")
    private String preNom;
    @Column(name = "ville")
    private String ville;
    @Column(name = "email")
    private String email;
    @Column(name = "tel")
    private Long tel;
    @Column(name = "MotDePasse")
    private String motDePasse;
}
