package fr.hotel.model;

import java.util.Date;
import java.util.Vector;

public class Reservation {
    private int numReservation;
    private boolean etatReservation;
    private int nbrNuit;
    private Date dateDebut;
    private Date dateFin;

    private Client client;
    private Receptionniste receptionniste;
    private Vector<Chambre> listeChambres;
    private Chambre c;

    public Reservation(int numReservation, boolean etatReservation, int nbrNuit, Date dateDebut, Date dateFin, Client client, Receptionniste receptionniste, Chambre c ) {
        this.numReservation = numReservation;
        this.etatReservation = etatReservation;
        this.nbrNuit = nbrNuit;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
        this.receptionniste = receptionniste;
        this.c = c;
    }



    public int getNumReservation() {
        return numReservation;
    }

    public void setNumReservation(int numReservation) {
        this.numReservation = numReservation;
    }

    public boolean isEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(boolean etatReservation) {
        this.etatReservation = etatReservation;
    }

    public int getNbrNuit() {
        return nbrNuit;
    }

    public void setNbrNuit(int nbrNuit) {
        this.nbrNuit = nbrNuit;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Receptionniste getReceptionniste() {
        return receptionniste;
    }

    public void setReceptionniste(Receptionniste receptionniste) {
        this.receptionniste = receptionniste;
    }

    public Vector<Chambre> getListeChambres() {
        return listeChambres;
    }

    public void setListeChambres(Vector<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }



}
