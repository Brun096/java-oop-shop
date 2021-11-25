package it.shop;

import java.util.Random;

public class Shop {
	
	//Attributi
	private int codice;
	private String nome;
	private String descrizione;
	private int prezzo;
	private int prezzoPieno;
	private int iva;
	private String nomePiuCodice;
	
	
	
	//Costruttori
	public Shop(){
		this.codice=generaCodice();
		this.prezzo=prezzoSenzaIva();
		this.prezzoPieno=prezzoConIva();
		this.nome=getNome();
		this.nomePiuCodice=nome_codice();
		this.descrizione=getDescrizione();
		this.iva=getIva();
		
		
		
	}
	
	//get set
	

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

	public int getPrezzoPieno() {
		return prezzoPieno;
	}

	public void setPrezzoPieno(int prezzoPieno) {
		this.prezzoPieno = prezzoPieno;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public String getNomePiuCodice() {
		return nomePiuCodice;
	}

	public void setNomePiuCodice(String nomePiuCodice) {
		this.nomePiuCodice = nomePiuCodice;
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
	

	//metodo per avere il nome esteso  concatenando codice
	private String nome_codice() {
		String nome_codice;
		nome_codice=nome+codice;
		return nome_codice;
	}
}
