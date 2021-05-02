package fr.hotel.model;

public class ChambreSuiteNormale extends Chambre{
    private float prixChambreSuiteNormale;
    private boolean bonEtatChambreSuiteNormale;
    private int nbPersonneChambreSuiteNormale;

    public ChambreSuiteNormale(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuiteNormale, int nbPersonneChambreSuiteNormale, float prixChambreSuiteNormale) {
        super(hotel, numChambre, numEtage);
        this.bonEtatChambreSuiteNormale= bonEtatChambreSuiteNormale;
        this.nbPersonneChambreSuiteNormale= nbPersonneChambreSuiteNormale;
        this.prixChambreSuiteNormale=prixChambreSuiteNormale;
    }

    public float getPrixChambreSuiteNormale() { return prixChambreSuiteNormale; }
    public void setPrixChambreSuiteNormale(float prix) { this.prixChambreSuiteNormale= prix; }
    public boolean isBonEtatChambreSuiteNormale() { return bonEtatChambreSuiteNormale; }
    public void setBonEtatChambreSuiteNormale(boolean bonEtatChambreSuiteNormale) {
        this.bonEtatChambreSuiteNormale = bonEtatChambreSuiteNormale; }
    public int getNbPersonneChambreSuiteNormale() { return nbPersonneChambreSuiteNormale; }

    public void setNbPersonneChambreSuiteNormale(int nbPersonneChambreSuiteNormale) {
        this.nbPersonneChambreSuiteNormale= nbPersonneChambreSuiteNormale;
    }

    @Override
    public float quelPrix(float nbrJours) {
        return prixChambreSuiteNormale*nbrJours;
    }

    @Override
    public String toString() {
        return "ChambreSuiteNormale{" +
                "prixChambreSuiteNormale=" + prixChambreSuiteNormale +
                ", bonEtatChambreSuiteNormale=" + bonEtatChambreSuiteNormale +
                ", nbPersonneChambreSuiteNormale=" + nbPersonneChambreSuiteNormale +
                '}';
    }
}
