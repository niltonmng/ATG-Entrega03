package grafo;

import java.util.ArrayList;
import java.util.List;

public class No implements Comparable<No>{
	
	private String nome;
	private List<Aresta> adj;
	
	public No(String nome) {
		this.setNome(nome);
		this.setAdj(new ArrayList<Aresta>());
	}
	
	public boolean addAdj(Aresta a) {
		return this.adj.add(a);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getAdj() {
		return adj;
	}

	public void setAdj(List<Aresta> adj) {
		this.adj = adj;
	}

	@Override
	public int compareTo(No n) {
		return this.nome.compareTo(n.nome);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof No) {
			No n = (No) o;
			return this.nome.equals(n.nome);
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return this.nome;
	}

}
