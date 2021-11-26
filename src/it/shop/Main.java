package it.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop shop=new Shop("Balsamo","Cura i capelli",30,22);
		
		System.out.println("il nome del prodotto è "+shop.getNome());
		System.out.println("il prezzo senza iva è "+shop.getPrezzo());
		System.out.println("il prezzo pieno con iva è "+shop.getPrezzoivato());
		System.out.println("il codice del prodotto è "+shop.getCodice());
		System.out.println("il codice-nome del prodotto è "+shop.getNomeEsteso());
		
		
	}

}
