package fr.hotel.model;

import java.util.Vector;

public class Hotel {
    private String nomHotel;
    private String AdresseHotel;
    private String telHotel;
    private int nbrEtoiles;

    private static Vector<Chambre> listeChambres;

    public Hotel(String nomHotel, String adresseHotel, String telHotel, int nbrEtoiles) {
        this.nomHotel = nomHotel;
        AdresseHotel = adresseHotel;
        this.telHotel = telHotel;
        this.nbrEtoiles = nbrEtoiles;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public void setNomHotel(String nomHotel) {
        this.nomHotel = nomHotel;
    }

    public String getAdresseHotel() {
        return AdresseHotel;
    }

    public void setAdresseHotel(String adresseHotel) {
        AdresseHotel = adresseHotel;
    }

    public String getTelHotel() {
        return telHotel;
    }

    public void setTelHotel(String telHotel) {
        this.telHotel = telHotel;
    }

    public int getNbrEtoiles() {
        return nbrEtoiles;
    }

    public void setNbrEtoiles(int nbrEtoiles) {
        this.nbrEtoiles = nbrEtoiles;
    }

    public static Vector<Chambre> getListeChambres() {
        return listeChambres;
    }

    public static void setListeChambres(Vector<Chambre> listeChambres) {
        Hotel.listeChambres = listeChambres;
    }
}
