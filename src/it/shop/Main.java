package it.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop=new Shop();
		
		
		System.out.println("il codice è: "+shop.getCodice());
		System.out.println("il nome è "+shop.getNome());
		System.out.println("il prezzo senza iva è "+shop.getPrezzo());
		System.out.println("il prezzo pieno è di "+shop.getIva());
		System.out.println(("il nome esteso del prodotto è "+shop.getNome_Codice()));
	}

}
