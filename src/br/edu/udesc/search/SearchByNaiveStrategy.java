package br.edu.udesc.search;

public class SearchByNaiveStrategy extends ASearchStrategy {

	public int searchFile(String content, String word) {
		// TODO 
		int i,cont=0;
		int tamanho = content.length();
		int tPalavra = word.length();
		for(i = 0; i<tamanho; i++){
			if(tPalavra + i == tamanho){
				if(word.equals(content.substring(i,tamanho))){
					cont++;
				}
				break;
			}
			if(word.equals(content.substring(i,tPalavra+i))){
				cont++;
			}
		}
		return cont;
	}



}
