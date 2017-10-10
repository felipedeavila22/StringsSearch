package br.edu.udesc.search;

import java.util.HashMap;
import java.util.Map;

public class SearchByBoyerMooreStrategy extends ASearchStrategy {

	int cont=0;
	
	public int searchFile(String content, String pat) {
		search(pat,content);
		return cont;
	}
	public void search(String pat, String txt) {
		  Map<Character, Integer> mt = new HashMap<Character, Integer>();
		  for (int i = 0; i < pat.length(); i++) {
		   mt.put(pat.charAt(i), i);
		  }
		  int skip = 0;
		  int N = txt.length();
		  int M = pat.length();
		  for (int i = 0; i <= N-M; i= i+ skip) {
		   skip = 0;
		   for (int j = M - 1; j >= 0; j--) {
		    if (pat.charAt(j) != txt.charAt(i+j)) {
		     if(mt.get(txt.charAt(i + j))!=null)
		      skip = Math.max(1, j - mt.get(txt.charAt(i + j)));
		     else
		      skip = j+1;
		     break;
		    }
		   }
		   if (skip == 0) {
		    cont++;
		    skip = 1; // vai para o proximo
		   }
		  }
		 }
	
		 public int search(String txt) {
		  String pat = "";
		  int R = 256;
		  int[] right = new int[R];
		  for (int c = 0; c < R; c++)
		   right[c] = -1;
		  for (int j = 0; j < pat.length(); j++)
		   right[pat.charAt(j)] = j;

		  int M = pat.length();
		  int N = txt.length();
		  int skip;
		  for (int i = 0; i <= N - M; i += skip) {
		   skip = 0;
		   for (int j = M - 1; j >= 0; j--) {
		    if (pat.charAt(j) != txt.charAt(i + j)) {
		     skip = Math.max(1, j - right[txt.charAt(i + j)]);
		     break;
		    }
		   }
		   if (skip == 0)
		    return i; // found
		  }
		  return N; // not found
		 }
}
