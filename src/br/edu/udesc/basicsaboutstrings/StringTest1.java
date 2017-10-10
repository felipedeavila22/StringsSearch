package br.edu.udesc.basicsaboutstrings;

public class StringTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			String frase1 = "the quick brown fox jumps over the lazy dog";
			String frase2 = "the quick brown fox jumps over the lazy dog";
			
			System.out.println( "Hash frase1" + frase1.hashCode() );
			System.out.println( "Hash frase2" + frase2.hashCode() );
			
			System.out.println( "Equals    " + frase1.equals(frase2));
			System.out.println( "CompareTo " + frase1.compareTo(frase2));

	}

}
