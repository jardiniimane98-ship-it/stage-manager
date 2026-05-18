package com.ehtp.stagemanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "internships")

public class Internship {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String titre;

    private String entreprise;

    private String etudiant;

    private String dateDebut;

    private String dateFin;

    private String statut;

    public Internship() {

    }

    public Internship(String titre, String entreprise, String etudiant, String dateDebut, String dateFin, String statut) {

        this.titre = titre;

        this.entreprise = entreprise;

        this.etudiant = etudiant;

        this.dateDebut = dateDebut;

        this.dateFin = dateFin;

        this.statut = statut;

    }

    public Long getId() {

        return id;

    }

    public String getTitre() {

        return titre;

    }

    public void setTitre(String titre) {

        this.titre = titre;

    }

    public String getEntreprise() {

        return entreprise;

    }

    public void setEntreprise(String entreprise) {

        this.entreprise = entreprise;

    }

    public String getEtudiant() {

        return etudiant;

    }

    public void setEtudiant(String etudiant) {

        this.etudiant = etudiant;

    }

    public String getDateDebut() {

        return dateDebut;

    }

    public void setDateDebut(String dateDebut) {

        this.dateDebut = dateDebut;

    }

    public String getDateFin() {

        return dateFin;

    }

    public void setDateFin(String dateFin) {

        this.dateFin = dateFin;

    }

    public String getStatut() {

        return statut;

    }

    public void setStatut(String statut) {

        this.statut = statut;

    }

}