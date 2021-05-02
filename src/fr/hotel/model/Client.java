package fr.hotel.model;
import java.util.List;
import java.util.Vector;

public class Client {
	    private  int numClient;
	    private  String nomClient;
	    private  String prenomClient;
	    private  String telClient;
	    private  String emailClient;

	    private Vector<Reservation> listeReservation ;

	public Client(int numClient, String nomClient, String prenomClient, String telClient, String emailClient) {
		this.numClient = numClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telClient = telClient;
		this.emailClient = emailClient;
	}

	public Client(int numClient, String nomClient, String prenomClient, String telClient, String emailClient, Vector<Reservation> listeReservation) {
		this.numClient = numClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telClient = telClient;
		this.emailClient = emailClient;
		this.listeReservation = listeReservation;
	}

	public int getNumClient() {
		return numClient;
	}

	public void setNumClient(int numClient) {
		this.numClient = numClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public Vector<Reservation> getListeReservation() {
		return listeReservation;
	}

	public void setListeReservation(Vector<Reservation> listeReservation) {
		this.listeReservation = listeReservation;
	}

	@Override
	public String toString() {
		return "Client{" +
				"numClient=" + numClient +
				", nomClient='" + nomClient + '\'' +
				", prenomClient='" + prenomClient + '\'' +
				", telClient='" + telClient + '\'' +
				", emailClient='" + emailClient + '\'' +
				", listeReservation=" + listeReservation +
				'}';
	}
}