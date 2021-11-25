package it.shop;

import java.util.Random;

public class Shop {
	
	//Attributi
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	private String nome_codice;
	
	
	
	//Costruttori
	public Shop(){
		this.codice=generaCodice();
		this.prezzo=prezzoSenzaIva();
		this.iva=prezzoConIva();
		this.nome=nomeProdotto(nome);
		this.nome_codice=nomePiuCodice(nome);
		
		
	}
	
	//get set
	public String getNome_Codice() {
		return nome_codice;
	}
	public void setNome_Codice(String nome_codice) {
		this.nome_codice = nome_codice;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
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
	
	//Metodi
	private int generaCodice(){
		
		Random random=new Random();
		codice=random.nextInt(1000);
		return codice;
	}
	//metodo per avere il prezzo base 

	private int prezzoSenzaIva() {
		int prezzoSenzaIva=prezzo;
		return prezzoSenzaIva;
	}
	//metodo per avere il prezzo con iva
	
	private int prezzoConIva() {
		int prezzoIva=prezzo+((prezzo*iva)/100);
		return prezzoIva;
	}
	//metodo per avere il nome

	private String nomeProdotto(String nomeProdotto) {
		nomeProdotto="";
		return nomeProdotto;
	}
	private String nomePiuCodice(String nomeProdotto) {
		
		String nomeEsteso=nomeProdotto+codice;
		return nomeEsteso;
	}
	
	//metodo per avere il nome esteso  concatenando codice
}
