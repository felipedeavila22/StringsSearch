package br.edu.udesc.search;

public class SearchContext {

	  private ISearchStrategy strategy;
	  // define a estrat�gia
	  public void setSearchStrategy(ISearchStrategy strategy) {
	    this.strategy = strategy;
	  }
	  
	  //usa a estrat�gia
	  public int search(String content, String word) {
	    return strategy.searchFile(content, word);
	  }
	}