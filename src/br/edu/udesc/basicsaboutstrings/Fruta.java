package br.edu.udesc.basicsaboutstrings;

public class Fruta implements Comparable {
	private String nome;
	private String codigo;
	private double preco;

	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	@Override
	public String toString() {
		return  nome;
	}


	public Fruta(String nome, String codigo, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco  = preco;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruta other = (Fruta) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	public int compareTo(Object fruta) {
		Fruta comparada = (Fruta) fruta;
		return this.getNome().compareTo(comparada.getNome());
	}

	

}
