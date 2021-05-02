package fr.hotel.model;

public class ChambreSimple extends Chambre{
    private float prixChambreSimple;
    private boolean bonEtatChambreSimple;
    private int nbPersonneChambreSimple;

    public ChambreSimple(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSimple, int nbPersonneChambreSimple, float prixChambreSimple) {
        super(hotel, numChambre, numEtage);
        this.bonEtatChambreSimple= bonEtatChambreSimple;
        this.nbPersonneChambreSimple= nbPersonneChambreSimple;
        this.prixChambreSimple=prixChambreSimple;
    }

    public float getPrixChambreSimple() { return prixChambreSimple; }
    public void setPrixChambreSimple(float prix) { this.prixChambreSimple = prix; }
    public boolean isBonEtatChambreSimple() { return bonEtatChambreSimple; }
    public void setBonEtatChambreSimple(boolean bonEtatChambreSimple) { this.bonEtatChambreSimple = bonEtatChambreSimple; }
    public int getNbPersonneChambreSimple() { return nbPersonneChambreSimple; }

    public void setNbPersonneChambreSimple(int nbPersonneChambreSimple) {
        this.nbPersonneChambreSimple= nbPersonneChambreSimple;
    }

    @Override
    public float quelPrix(float nbrJours) {
        return prixChambreSimple*nbrJours;
    }

    @Override
    public String toString() {
        return "ChambreSimple{" +
                "prixChambreSimple=" + prixChambreSimple +
                ", bonEtatChambreSimple=" + bonEtatChambreSimple +
                ", nbPersonneChambreSimple=" + nbPersonneChambreSimple +
                '}';
    }
}
