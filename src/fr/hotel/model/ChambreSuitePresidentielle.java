package fr.hotel.model;

public class ChambreSuitePresidentielle extends Chambre{
        private float prixChambreSuitePresidentielle;
        private boolean bonEtatChambreSuitePresidentielle;
        private int nbPersonneChambreSuitePresidentielle;

        public ChambreSuitePresidentielle(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuitePresidentielle, int nbPersonneChambreSuitePresidentielle, float prixChambreSuitePresidentielle) {
            super(hotel, numChambre, numEtage);
            this.bonEtatChambreSuitePresidentielle= bonEtatChambreSuitePresidentielle;
            this.nbPersonneChambreSuitePresidentielle= nbPersonneChambreSuitePresidentielle;
            this.prixChambreSuitePresidentielle=prixChambreSuitePresidentielle;
        }

    public float getPrixChambreSuitePresidentielle() { return prixChambreSuitePresidentielle; }
        public void setPrixChambreSuitePresidentielle(float prix) { this.prixChambreSuitePresidentielle= prix; }
        public boolean isBonEtatChambreSuitePresidentielle() { return bonEtatChambreSuitePresidentielle; }
        public void setBonEtatChambreSuitePresidentielle(boolean bonEtatChambreSuitePresidentielle) {
            this.bonEtatChambreSuitePresidentielle = bonEtatChambreSuitePresidentielle; }
        public int getNbPersonneChambreSuitePresidentielle() { return nbPersonneChambreSuitePresidentielle; }

        public void setNbPersonneChambreSuitePresidentielle(int nbPersonneChambreSuitePresidentielle) {
            this.nbPersonneChambreSuitePresidentielle= nbPersonneChambreSuitePresidentielle;
        }

    @Override
    public float quelPrix(float nbrJours) {
        return prixChambreSuitePresidentielle*nbrJours;
    }

    @Override
    public String toString() {
        return "ChambreSuitePresidentielle{" +
                "prixChambreSuitePresidentielle=" + prixChambreSuitePresidentielle +
                ", bonEtatChambreSuitePresidentielle=" + bonEtatChambreSuitePresidentielle +
                ", nbPersonneChambreSuitePresidentielle=" + nbPersonneChambreSuitePresidentielle +
                '}';
    }
}

