package it.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop=new Shop();
		
		
		System.out.println(shop.getNome());
		System.out.println("il codice �: "+shop.getCodice());
		System.out.println("il prezzo senza iva �: "+shop.getPrezzo());
		System.out.println("prezzo con iva "+shop.getPrezzoPieno());
		System.out.println("descrizione del prodotto: "+shop.getDescrizione());
		System.out.println("il codice-nome del prodotto �: "+shop.getNomePiuCodice());
	}

}
