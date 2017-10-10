package br.edu.udesc.basicsaboutstrings;

public class UsoDaMemoria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int MAX = 60000;
		StringBuilder builder = new StringBuilder();
		builder.append("teste");
		for (int i = 0; i < MAX; i++) {
			builder.append("z");
		}
		System.out.println(builder.toString());
	}

}
