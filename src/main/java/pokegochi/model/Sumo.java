package pokegochi.model;

public class Sumo implements Treinar{

	private String nomeTreino = "SUMO";
	private int valorAprendidoPorHora = 2; 
	private int valorAprendido = 0; 
	private int tempoAprendido = 1000; 

	public void iniciarTreino(Jogador2 jogador, int horas){
		System.out.println("iniciando treino de -> " + this.nomeTreino);
		System.out.println("Treinando...    Dano Antigo: " + jogador.getPokegochi().getDano());
		
		this.valorAprendido = this.valorAprendidoPorHora * horas;
		jogador.getPokegochi().setDano(this.valorAprendido);
		jogador.setAcabouTreino(true);
		System.out.println("                Dano Novo: " + jogador.getPokegochi().getDano());
		System.out.println("          treino de -> " + this.nomeTreino + "   -> fim do treino");
	}

}
