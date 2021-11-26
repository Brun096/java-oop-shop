package it.shop;

import java.util.Random;

public class Shop {
	
	//Attributi
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	
	
	
	//Costruttori
	public Shop(){
		this.codice=generaCodice();
		this.prezzo=getPrezzo();
		this.iva=getIva();
		
		
		
	}
	

	//get set
	

	public Shop(String nome, String descrizione, int prezzo, int iva) {
		this.codice=generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeEsteso() {
		String nomeEsteso=nome+codice;
		return nomeEsteso;
	}
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	//metodo per il prezzo ivato
	public int getPrezzoivato() {
		int prezzoIvato=prezzo+((prezzo*iva)/100);
		return prezzoIvato;
	}
	
	
	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	


	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	

	

	public int getCodice() {
		return codice;
	}

	//Metodo genera codice
	private int generaCodice(){
		
		Random random=new Random();
		codice=random.nextInt(1000);
		return codice;
	}
}
