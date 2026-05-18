package com.ehtp.stagemanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "companies")

public class Company {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nom;

    private String secteur;

    private String ville;

    private String email;

    public Company() {

    }

    public Company(String nom, String secteur, String ville, String email) {

        this.nom = nom;

        this.secteur = secteur;

        this.ville = ville;

        this.email = email;

    }

    public Long getId() {

        return id;

    }

    public String getNom() {

        return nom;

    }

    public void setNom(String nom) {

        this.nom = nom;

    }

    public String getSecteur() {

        return secteur;

    }

    public void setSecteur(String secteur) {

        this.secteur = secteur;

    }

    public String getVille() {

        return ville;

    }

    public void setVille(String ville) {

        this.ville = ville;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

}