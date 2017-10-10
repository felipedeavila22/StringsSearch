package br.edu.udesc.search;

public class SearchContext {

	  private ISearchStrategy strategy;
	  // define a estratégia
	  public void setSearchStrategy(ISearchStrategy strategy) {
	    this.strategy = strategy;
	  }
	  
	  //usa a estratégia
	  public int search(String content, String word) {
	    return strategy.searchFile(content, word);
	  }
	}