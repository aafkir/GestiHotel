package fr.hotel.model;

public abstract class Chambre {
	private  int numChambre;
    private  int numEtage;
    private Hotel hotel;

    public Chambre(int numChambre, int numEtage, Hotel hotel) {
        this.numChambre = numChambre;
        this.numEtage = numEtage;
        this.hotel = hotel;
    }
    public Chambre(Hotel hotel, int numChambre, int numEtage) { }

    public abstract float quelPrix (float nbrJours);

    public int getNumChambre() { return numChambre; }
    public void setNumChambre(int numChambre) { this.numChambre = numChambre; }
    public int getNumEtage() { return numEtage; }
    public void setNumEtage(int numEtage) { this.numEtage = numEtage; }


}
