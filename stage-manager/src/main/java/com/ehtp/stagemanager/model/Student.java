package com.ehtp.stagemanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "students")

public class Student {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nom;

    private String email;

    private String filiere;

    private String niveau;

    private String cvFileName;

    public Student() {

    }

    public Student(Long id,

                   String nom,

                   String email,

                   String filiere,

                   String niveau,

                   String cvFileName) {

        this.id = id;

        this.nom = nom;

        this.email = email;

        this.filiere = filiere;

        this.niveau = niveau;

        this.cvFileName = cvFileName;

    }

    public Long getId() {

        return id;

    }

    public void setId(Long id) {

        this.id = id;

    }

    public String getNom() {

        return nom;

    }

    public void setNom(String nom) {

        this.nom = nom;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public String getFiliere() {

        return filiere;

    }

    public void setFiliere(String filiere) {

        this.filiere = filiere;

    }

    public String getNiveau() {

        return niveau;

    }

    public void setNiveau(String niveau) {

        this.niveau = niveau;

    }

    public String getCvFileName() {

        return cvFileName;

    }

    public void setCvFileName(String cvFileName) {

        this.cvFileName = cvFileName;

    }

}