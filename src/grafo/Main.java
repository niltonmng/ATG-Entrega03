package grafo;

public class Main {
	
	public static void main(String[] args) {
		
		Grafo mapa = new Grafo();
		
		No acudeVelho = new No("Acude Velho");
		No museuPandeiro = new No("Museu Pandeiro");
		No jacquesPandeiro = new No("Jacques Pandeiro");
		No pp = new No("Parque Povo");
		No acudeNovo = new No("Acude Novo");
		No ufcg = new No("UFCG");
		
		mapa.add_No(acudeNovo);
		mapa.add_No(museuPandeiro);
		mapa.add_No(acudeVelho);
		mapa.add_No(pp);
		mapa.add_No(ufcg);
		mapa.add_No(jacquesPandeiro);
		
		mapa.add_Aresta(acudeVelho, jacquesPandeiro, 1, "1");
		mapa.add_Aresta(acudeVelho, museuPandeiro, 1, "2");
		mapa.add_Aresta(pp, ufcg, 3, "3");
		mapa.add_Aresta(pp, acudeNovo, 1, "4");
		mapa.add_Aresta(acudeVelho, ufcg, 2, "5");
		
	}

}
