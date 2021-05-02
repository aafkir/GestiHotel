package fr.hotel.metier;
import fr.hotel.model.*;

import java.util.Date;
import java.util.List;
import java.util.Vector;

public interface IMetier {
 //Gestion Chambres
        public void ajouterNouvelleChambreSimple(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSimple, int nbPersonneChambreSimple, float prixChambreSimple);
        public void ajouterNouvelleChambreDouble(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreDouble, int nbPersonneChambreDouble, float prixChambreDouble );
        public void ajouterNouvelleChambreSuiteNormale(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuiteNormale, int nbPersonneChambreSuiteNormale, float prixChambreSuiteNormale);
        public void ajouterNouvelleChambreSUitePresidentielle (Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuitePresidentielle, int nbPersonneChambreSuitePresidentielle, float prixChambreSuitePresidentielle);

        public void modifierEtatChambreSimple(ChambreSimple cs);
        public void modifierEtatChambreDouble(ChambreDouble cd);
        public void modifierEtatChambreSuiteNormale(ChambreSuiteNormale cn);
        public void modifierEtatChambreSuitePresidentielle(ChambreSuitePresidentielle cp);

        public void modifierPrixChambreSimple(ChambreSimple cs, float pr);
        public void modifierPrixChambreDouble(ChambreDouble cd, float pr);
        public void modifierPrixChambreSuiteNormale(ChambreSuiteNormale cn, float pr);
        public void modifierPrixChambreSuitePresidentielle(ChambreSuitePresidentielle cp, float pr);

        public void suprimerChambreSimple(ChambreSimple cs);
        public void suprimerChambreDouble(ChambreDouble cd);
        public void suprimerChambreSuiteNormale(ChambreSuiteNormale cn);
        public void suprimerChambreSuitePresidentielle(ChambreSuitePresidentielle cp);
        public void afficherListeChambres();

 // Gestion  Clients
        public void ajoutClient(int numClient, String nomClient, String prenomClient, String telClient, String emailClient);
        public void suppClient(Client c );
        public void afficherListClient();
        public void afficherClient (Client c);
        public void modifierIdentiteClient(Client c, String nomClient, String prenomClient);
        public void modifierCoordoneesClient(Client c,String telClient, String emailClient);


 // Gestion  reservation
        public void creerReservation (int numReservation, boolean etatReservation, int nbrNuit, Date dateDébut, Date dateFin, Client client, Receptionniste receptionniste, Chambre c );
        public void modifierDateDebutReservation (Reservation r,Date dateDébut);
        public void modifierDateFinReservation (Reservation r,Date dateFin);
        public void modifierClientDeLaReservation (Reservation r,Client client);
        public void confirmerReservation (Reservation r,boolean etatReservation);
        public void annulerReservation (Reservation r,boolean etatReservation);
        public void supprimerReservation (Reservation r);
        public void afficheDisponibleChambreParCat (Chambre c);

//Gestion Séjour & Facturation
        public void creeSejour (int numSejour, List<String> serviceRestauration, List<String> serviceConsoMiniBar, boolean servicePrivatisation, Reservation reservation, Chambre chambre);
        public void afficheDetailSejour (Sejour s);
        public void ajouterDesConsomationsMiniBar (Sejour s,String sm);
        public void ajouterDesServiceRestauration (Sejour s,String sr);
       public float calculFactureTotale(Sejour s);

}