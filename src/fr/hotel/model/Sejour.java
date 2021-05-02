package fr.hotel.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Sejour {
    private int numSejour;
    private List<String> ServiceRestauration ;
    private List<String> ServiceConsoMiniBar;
    private boolean ServicePrivatisation;
	private  Reservation reservation;
    private  Chambre chambre;

    public Sejour(int numSejour, List<String> serviceRestauration, List<String> serviceConsoMiniBar, boolean servicePrivatisation, Reservation reservation, Chambre chambre) {
        this.numSejour = numSejour;
        this.ServiceRestauration = new ArrayList<>();
        this.ServiceConsoMiniBar = new ArrayList<>();
        this.ServicePrivatisation = servicePrivatisation;
        this.reservation = reservation;
        this.chambre = chambre;
    }

    public int getNumSejour() { return numSejour; }
    public void setNumSejour(int numSejour) { this.numSejour = numSejour; }

    public List<String> getServiceRestauration() { return  new ArrayList(ServiceRestauration); }
    public void setServiceRestauration(List<String> serviceRestauration) { ServiceRestauration = serviceRestauration; }
    public List<String> getServiceConsoMiniBar() { return  new ArrayList(ServiceConsoMiniBar); }
    public void setServiceConsoMiniBar(List<String> serviceConsoMiniBar) { ServiceConsoMiniBar = serviceConsoMiniBar; }

    public boolean isServicePrivatisation() { return ServicePrivatisation; }
    public void setServicePrivatisation(boolean servicePrivatisation) { ServicePrivatisation = servicePrivatisation; }

    public Reservation getReservation() { return reservation; }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation; }

    public Chambre getChambre() { return chambre; }
    public void setChambre(Chambre chambre) { this.chambre = chambre; }

    @Override
    public String toString() {
        return "Sejour{" +
                "numSejour=" + numSejour +
                ", ServiceRestauration=" + ServiceRestauration +
                ", ServiceConsoMiniBar=" + ServiceConsoMiniBar +
                ", ServicePrivatisation=" + ServicePrivatisation +
                ", reservation=" + reservation +
                ", chambre=" + chambre +
                '}';
    }
}
