package fr.hotel.model;

import java.util.Vector;

public class PersonnelEntretien {

    private String nomPersonnelEntretien;
    private  String prenomPersonnelEntretien;
    private int numPersonnelEntretien;

    private Vector<Chambre> listeChambre;

    public PersonnelEntretien(String nomPersonnelEntretien, String prenomPersonnelEntretien, int numPersonnelEntretien) {
        this.nomPersonnelEntretien = nomPersonnelEntretien;
        this.prenomPersonnelEntretien = prenomPersonnelEntretien;
        this.numPersonnelEntretien = numPersonnelEntretien;
    }

    public String getNomPersonnelEntretien() {
        return nomPersonnelEntretien;
    }

    public String getPrenomPersonnelEntretien() {
        return prenomPersonnelEntretien;
    }

    public int getNumPersonnelEntretien() {
        return numPersonnelEntretien;
    }

    public Vector<Chambre> getListeChambre() {
        return listeChambre;
    }

    public void setListeChambre(Vector<Chambre> listeChambre) {
        this.listeChambre = listeChambre;
    }
}
