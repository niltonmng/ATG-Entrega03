package grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	
	private List<No> nos;
	private List<Aresta> arestas;
	private int size;
	
	public Grafo() {
		this.setSize(0);
		this.setArestas(new ArrayList<Aresta>());
		this.setNos(new ArrayList<No>());
	}
	
	public boolean add_No(No n) {
		return this.nos.add(n);
	}
	
	public boolean cria_No_e_add(String nome) {
		No n = new No(nome);
		if(!contem_No(n)) {
			this.add_No(n);
			return true;
		}
		return false;
	}
	
	public No get_No_Por_Nome(String nome) {
		for (No n : nos) {
			if(n.getNome().equals(nome)) return n;
		}
		throw new RuntimeException("Nao encontrei o no por nome!");
	}
	
	public boolean contem_No(No n) {
		for (No no : nos) {
			if(no.getNome().equals(n.getNome())) return true;
		}
		return false;
	}
	
	public void add_Aresta(No o, No d, double peso, String id) {
		Aresta fE = new Aresta(o, d, id, peso);
		Aresta sE = new Aresta(d, o, id, peso);
		this.arestas.add(fE);
		this.arestas.add(sE);
		o.addAdj(fE);
		d.addAdj(sE);		
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

	public List<No> getNos() {
		return nos;
	}

	public void setNos(List<No> nos) {
		this.nos = nos;
	}	
}
