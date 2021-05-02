package fr.hotel.model;

import java.util.Vector;

public class Receptionniste {
    private  String nomR;
    private String prenomR;
    private String email;
    private String password;
    private int numR;


    private Vector<Reservation> listeReservation;

    public Receptionniste(String nomR, String prenomR, int numR) {
        this.nomR = nomR;
        this.prenomR = prenomR;
        this.numR = numR;
    }

    public Receptionniste() {

    }

    public void signup(String nomR, String email, String password) {
        this.nomR=nomR;
        this.email=email;
        this.password=password;

    }

    public String getNomR() {
        return nomR;
    }

    public String getPrenomR() {
        return prenomR;
    }

    public int getNumR() {
        return numR;
    }

    public Vector<Reservation> getListeReservation() {
        return listeReservation;
    }

    public void setListeReservation(Vector<Reservation> listeReservation) {
        this.listeReservation = listeReservation;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public void setPrenomR(String prenomR) {
        this.prenomR = prenomR;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNumR(int numR) {
        this.numR = numR;
    }
}
