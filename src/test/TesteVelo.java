package test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import br.edu.udesc.search.SearchByAhoStrategy;
import br.edu.udesc.search.SearchByBoyerMooreStrategy;
import br.edu.udesc.search.SearchByKMPStrategy;
import br.edu.udesc.search.SearchByNaiveStrategy;
import br.edu.udesc.search.SearchByRabinKarpStrategy;
import br.edu.udesc.search.SearchContext;

public class TesteVelo {

	private static String content;

	static {
		File   fi =  new File("resource/teste.txt");

		try(FileReader     fr = new FileReader(fi);
			BufferedReader br = new BufferedReader(fr) ) 
		{
			String sCurrentLine;
			StringBuilder builder = new StringBuilder();
			while ((sCurrentLine = br.readLine()) != null) {
				builder.append(sCurrentLine);
			}
			content = builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	

	
	@Test
	public void testNaive() {
		SearchContext ctx = new SearchContext();
		ctx.setSearchStrategy(new SearchByNaiveStrategy());
		int found = ctx.search(content, "Omir");
		assertEquals(1, found);
	}
	@Test
	public void testRabin() {
		SearchContext ctx = new SearchContext();
		ctx.setSearchStrategy(new SearchByRabinKarpStrategy());
		int found = ctx.search(content, "Omir");
		assertEquals(1, found);
		
	}
	@Test
	public void testBoyer() {
		SearchContext ctx = new SearchContext();
		ctx.setSearchStrategy(new SearchByBoyerMooreStrategy());
		int found = ctx.search(content, "Omir");
		assertEquals(1, found);

		
	}
	@Test
	public void testKMP() {
		SearchContext ctx = new SearchContext();
		ctx.setSearchStrategy(new SearchByKMPStrategy());
		int found = ctx.search(content, "Omir");
		assertEquals(1, found);
	}
	@Test
	public void testAho() {
		SearchContext ctx = new SearchContext();
		ctx.setSearchStrategy(new SearchByAhoStrategy());
		int found = ctx.search(content, "Omir");
		assertEquals(1, found);
	}
	
	
}
