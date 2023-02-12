package com.GestionDe.Livraison.models;

import javax.persistence.*;

@Entity
@Table(name="livreur")

public class Livreur {
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

    public Livreur() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getEmail() {
        return email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getPreNom() {
        return preNom;
    }

    public void setPreNom(String preNom) {
        this.preNom = preNom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
