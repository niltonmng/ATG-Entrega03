package grafo;

public class Aresta implements Comparable<Aresta> {
	
	private No origem;
	private No destino;
	private double peso;
	private String id;
	
	public Aresta(No origem, No destino, String id, double peso) {
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setId(id);
		this.peso = peso;
	}

	@Override
	public int compareTo(Aresta o) {
		if(this.peso < o.peso) return -1;
		else if(this.peso > o.peso) return 1;
		else return 0;
	}
	
	@Override
	public String toString() {
		return this.origem.getNome() + " -> " + this.destino.getNome() + " : " + this.peso + " : " + this.id;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public No getDestino() {
		return destino;
	}

	public void setDestino(No destino) {
		this.destino = destino;
	}

	public No getOrigem() {
		return origem;
	}

	public void setOrigem(No origem) {
		this.origem = origem;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
