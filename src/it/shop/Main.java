package it.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop=new Shop();
		
		
		System.out.println("il codice �: "+shop.getCodice());
		System.out.println("il nome � "+shop.getNome());
		System.out.println("il prezzo senza iva � "+shop.getPrezzo());
		System.out.println("il prezzo pieno � di "+shop.getIva());
		System.out.println(("il nome esteso del prodotto � "+shop.getNome_Codice()));
	}

}
