package br.edu.udesc.search;

public class SearchByRabinKarpStrategy extends ASearchStrategy {

	public int searchFile(String content, String word) {
		// TODO Implementar
		   int M = word.length();
		   int N = content.length();
		   long patHash = word.hashCode();
		   int cont=0;
	
		   for (int i = 0; i <= N - M; i++) {
		      long txtHash = content.substring(i, i+M).hashCode();
		      if (patHash == txtHash)
		         cont++;
		   }
		   return cont;
	}



}
