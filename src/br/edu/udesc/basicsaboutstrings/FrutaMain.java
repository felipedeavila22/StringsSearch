package br.edu.udesc.basicsaboutstrings;

import java.util.Arrays;

public class FrutaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fruta maca = new Fruta("maçã", "1",5.00);
		Fruta banana = new Fruta("banana", "2",3.00);
		Fruta nanica = new Fruta("banana", "3",3.15);
		Fruta abacaxi = new Fruta("abacaxi", "4",4.51);
		
		Fruta[] frutas = {maca, banana, nanica,abacaxi};
		
		//Arrays.sort(frutas);
		//for (Fruta fruta : frutas) {
		//	System.out.println(fruta);
		//}
		
		Arrays.sort(frutas, new FrutaPorPreco());
		for (Fruta fruta : frutas) {
			System.out.println(fruta.getPreco() + " " + fruta.getNome());
		}
		
		System.out.println("Maçã com banana   "  + maca.compareTo(banana) );
		System.out.println("Nanica com banana "  + nanica.compareTo(banana) );

	}

}
