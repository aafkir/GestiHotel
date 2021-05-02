package fr.hotel.model;

public class ChambreDouble extends  Chambre{
    private float prixChambreDouble;
    private boolean bonEtatChambreDouble;
    private int nbPersonneChambreDouble;

    public ChambreDouble(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreDouble, int nbPersonneChambreDouble, float prixChambreDouble) {
        super(hotel, numChambre, numEtage);
        this.bonEtatChambreDouble= bonEtatChambreDouble;
        this.nbPersonneChambreDouble= nbPersonneChambreDouble;
        this.prixChambreDouble=prixChambreDouble;
    }

    public float getPrixChambreDouble() { return prixChambreDouble; }
    public void setPrixChambreDouble(float prix) { this.prixChambreDouble = prix; }
    public boolean isBonEtatChambreDouble() { return bonEtatChambreDouble; }
    public void setBonEtatChambreDouble(boolean bonEtatChambreDouble) { this.bonEtatChambreDouble = bonEtatChambreDouble; }
    public int getNbPersonneChambreDouble() { return nbPersonneChambreDouble; }
    public void setNbPersonneChambreDouble(int nbPersonneChambreDouble) {
        this.nbPersonneChambreDouble = nbPersonneChambreDouble;
    }

    @Override
    public float quelPrix(float nbrJours) {
        return prixChambreDouble*nbrJours;
    }

    @Override
    public String toString() {
        return "ChambreDouble{" +
                "prixChambreDouble=" + prixChambreDouble +
                ", bonEtatChambreDouble=" + bonEtatChambreDouble +
                ", nbPersonneChambreDouble=" + nbPersonneChambreDouble +
                '}';
    }
}
