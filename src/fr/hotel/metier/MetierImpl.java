package fr.hotel.metier;
import fr.hotel.model.*;

import java.util.*;

public class MetierImpl implements IMetier {
    public static Vector<Chambre> listeChambres = new Vector<>();
    public static Vector<Client> listeClients = new Vector<>();
    public static Vector<Reservation> listeReservations = new Vector<>();
    public static Vector<Sejour> listeSejours = new Vector<>();

    @Override public void ajouterNouvelleChambreSimple(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSimple, int nbPersonneChambreSimple, float prixChambreSimple) {
    ChambreSimple cs = new ChambreSimple(hotel,numChambre,numEtage,bonEtatChambreSimple,nbPersonneChambreSimple,prixChambreSimple);
    listeChambres.add(cs); }
    @Override public void ajouterNouvelleChambreDouble(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreDouble, int nbPersonneChambreDouble, float prixChambreDouble) {
    ChambreDouble cd = new ChambreDouble(hotel,numChambre,numEtage,bonEtatChambreDouble,nbPersonneChambreDouble,prixChambreDouble);
        listeChambres.add(cd);}
    @Override public void ajouterNouvelleChambreSuiteNormale(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuiteNormale, int nbPersonneChambreSuiteNormale, float prixChambreSuiteNormale) {
     ChambreSuiteNormale cn = new ChambreSuiteNormale(hotel,numChambre,numEtage,bonEtatChambreSuiteNormale,nbPersonneChambreSuiteNormale,prixChambreSuiteNormale);
     listeChambres.add(cn);}
    @Override public void ajouterNouvelleChambreSUitePresidentielle(Hotel hotel, int numChambre, int numEtage, boolean bonEtatChambreSuitePresidentielle, int nbPersonneChambreSuitePresidentielle, float prixChambreSuitePresidentielle) {
        ChambreSuitePresidentielle cp = new ChambreSuitePresidentielle(hotel,numChambre,numEtage,bonEtatChambreSuitePresidentielle,nbPersonneChambreSuitePresidentielle,prixChambreSuitePresidentielle);
        listeChambres.add(cp);}

    @Override public void modifierEtatChambreSimple(ChambreSimple cs) { cs.setBonEtatChambreSimple (true);}
    @Override public void modifierEtatChambreDouble(ChambreDouble cd) { cd.setBonEtatChambreDouble(true);}
    @Override public void modifierEtatChambreSuiteNormale(ChambreSuiteNormale cn) { cn.setBonEtatChambreSuiteNormale(true); }
    @Override public void modifierEtatChambreSuitePresidentielle(ChambreSuitePresidentielle cp) {cp.setBonEtatChambreSuitePresidentielle(true);  }

    @Override public void modifierPrixChambreDouble(ChambreDouble cd, float pr) {cd.setPrixChambreDouble(pr); }
    @Override public void modifierPrixChambreSimple(ChambreSimple cs, float pr) {  cs.setPrixChambreSimple(pr); }
    @Override public void modifierPrixChambreSuiteNormale(ChambreSuiteNormale cn, float pr) { cn.setPrixChambreSuiteNormale(pr);}
    @Override public void modifierPrixChambreSuitePresidentielle(ChambreSuitePresidentielle cp, float pr) { cp.setPrixChambreSuitePresidentielle(pr);}

    @Override public void suprimerChambreSimple(ChambreSimple cs) { cs=null;}
    @Override public void suprimerChambreDouble(ChambreDouble cd) { cd =null; }
    @Override public void suprimerChambreSuiteNormale(ChambreSuiteNormale cn) { cn=null;}
    @Override public void suprimerChambreSuitePresidentielle(ChambreSuitePresidentielle cp) {cp=null;}
    @Override public void afficherListeChambres() {
        for (int i=0; i<listeChambres.size();i++) { listeChambres.get(i).toString(); } }

// clients
    @Override
    public void ajoutClient(int numClient, String nomClient, String prenomClient, String telClient, String emailClient) {
        Client c = new Client(numClient, nomClient, prenomClient,telClient,emailClient);
        listeClients.add(c); }
    @Override public void suppClient(Client c) { c=null;}
    @Override public void afficherListClient() {
        for (int i=0; i<listeClients.size();i++) { listeClients.get(i).toString(); } }
    @Override public void afficherClient(Client c) { c.toString(); }
    @Override public void modifierIdentiteClient(Client c, String nomClient, String prenomClient) {
        c.setNomClient(nomClient);
        c.setNomClient(prenomClient); }
    @Override public void modifierCoordoneesClient(Client c,String telClient, String emailClient) {
        c.setTelClient(telClient);
        c.setEmailClient(emailClient); }



//Reservation
    @Override public void creerReservation(int numReservation, boolean etatReservation, int nbrNuit, Date dateDebut, Date dateFin, Client client, Receptionniste receptionniste, Chambre c ) {
    Reservation r = new Reservation(numReservation,etatReservation, nbrNuit, dateDebut, dateFin, client, receptionniste,c); }
    @Override public void modifierDateDebutReservation(Reservation r, Date dateDebut) {
        r.setDateDebut(dateDebut); }
    @Override public void modifierDateFinReservation(Reservation r, Date dateFin) {
        r.setDateFin(dateFin); }
    @Override public void modifierClientDeLaReservation(Reservation r, Client client) {
         r.setClient(client); }
    @Override public void confirmerReservation(Reservation r, boolean etatReservation) {
        r.setEtatReservation(true); }
    @Override public void annulerReservation(Reservation r, boolean etatReservation) {
        r.setEtatReservation(false); }
    @Override public void supprimerReservation(Reservation r) {  r=null;  }

    @Override public void afficheDisponibleChambreParCat(Chambre c) {
        for (int i=0; i<listeReservations.size();i++) {
            listeReservations.get(i).toString(); } }


 //Gestion Séjour & Facturation
    @Override public void creeSejour(int numSejour, List<String> serviceRestauration, List<String> serviceConsoMiniBar, boolean servicePrivatisation, Reservation reservation, Chambre chambre) {
        Sejour s = new Sejour(numSejour, serviceRestauration = new ArrayList<>(),
                serviceConsoMiniBar = new ArrayList<>(),servicePrivatisation,reservation,chambre);
        listeSejours.add(s);}
    @Override public void afficheDetailSejour(Sejour s) { s.toString();}
    @Override public void ajouterDesConsomationsMiniBar(Sejour s, String sm) {
      s.setServiceConsoMiniBar(Collections.singletonList(sm));}
    @Override public void ajouterDesServiceRestauration(Sejour s,String sr) {
        s.setServiceRestauration(Collections.singletonList(sr)); }

    @Override public float calculFactureTotale(Sejour s) {
        if (s.isServicePrivatisation() == false)
            return s.getServiceConsoMiniBar().size() * 10 + s.getServiceRestauration().size()*20 + s.getChambre().quelPrix(3) ;
        else return  (100 + s.getServiceConsoMiniBar().size() * 10 + s.getServiceRestauration().size()*30+ s.getChambre().quelPrix(3));
    }






//GETTERS & SETTERS
    public static Vector<Chambre> getListeChambres() { return listeChambres; }
    public static void setListeChambres(Vector<Chambre> listeChambres) { MetierImpl.listeChambres = listeChambres; }
    public static Vector<Client> getListeClients() { return listeClients; }
    public static void setListeClients(Vector<Client> listeClients) { MetierImpl.listeClients = listeClients; }
    public static Vector<Reservation> getListeReservations() { return listeReservations; }
    public static void setListeReservations(Vector<Reservation> listeReservations) { MetierImpl.listeReservations = listeReservations; }
    public static Vector<Sejour> getListeSejours() { return listeSejours; }
    public static void setListeSejours(Vector<Sejour> listeSejours) { MetierImpl.listeSejours = listeSejours; }

//  public static Vector<Chambre> getListeChambres() { return listeChambres; }
       // public static void setListeChambres(Vector<Chambre> listeChambres) {MetierImpl.listeChambres = listeChambres;}
    }
/*
    @Override
    public void ajoutClient(Client c) {
        listeClient.add(c);
        System.out.println("le client a bien été ajouté");
    }

    @Override
    public void suppClient(Client c) {
        listeClient.remove(c);
        System.out.println("le client a bien été Supprimer");
    }

    @Override
    public void afficherListClient() {
        listeClient.forEach(p -> System.out.println(p.toString()));
    }

    @Override
    public void afficherClient(Client c) {
        //c.getClass().toString();
        c.AfficheC();
    }

    @Override
    public void modiffierInfoClient(Client c) {

    }

    @Override
    public void modifierInfoClient (Client c) {
        //c.getClass().toString();

        c.setNomClient();
        c.setPrenomClient();

    }


    @Override
    public void creerReservation(Reservation r) {
        listeReservation.add(r);
        System.out.println("Votre reservation est bien prise en compte");
    }

    @Override
    public void modifierReservation( Reservation r, Reservation reservationModified) {
        // r.getNumReservation(reservationModified.getNumReservation());
        r.setDateDébut(reservationModified.getDateDébut());
        r.setNbrNuit(reservationModified.getNbrNuit());
        r.setEtatReservation(reservationModified.etatReservation);
    }

    @Override
    public void supprimerReservation(Reservation r) {
        listeReservation.remove(r);
        System.out.println("la réservation à bien été Supprimer");
    }

    @Override
    public void confirmerReservation(Reservation r) {

    }

    @Override
    public void afficheDisponibleChambreParCat(Chambre c) {

    }

    @Override
    public void afficheDetailSejour(Chambre c) {

    }

    @Override
    public void afficherListeChambre(Chambre c) {

    }

    @Override
    public void afficherListePersonnelEntretien(PersonnelEntretien p) {

    }

    @Override
    public void afficherListeReceptionniste(Receptionniste r) {

    }

    @Override
    public void afficherListeReceptionniste(Receptionniste r) {

    }

    @Override
    public void afficherListClient(Client c) {

    }



    @Override
    public void modifierReservation(Reservation r) {
    }

 */