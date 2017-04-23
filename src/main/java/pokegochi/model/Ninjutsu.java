package pokegochi.model;

public class Ninjutsu implements Treinar{
	
	private String nomeTreino = "NINJUTSU";
	private int valorAprendidoPorHora = 10; 
	private int valorAprendido = 0; 
	private int tempoAprendido = 1000;

	public void iniciarTreino(Jogador2 jogador, int horas){
		System.out.println("iniciando treino de -> " + this.nomeTreino);
		System.out.println("Treinando...    Velocidade de Ataque Antiga: " + jogador.getPokegochi().getVelocidadeAtaque());
		
		this.valorAprendido = this.valorAprendidoPorHora * horas;
		jogador.getPokegochi().setVelocidadeAtaque(this.valorAprendido);
		jogador.setAcabouTreino(true);
		System.out.println("                Velocidade de Ataque Nova: " + jogador.getPokegochi().getVelocidadeAtaque());
		System.out.println("          treino de -> " + this.nomeTreino + "   -> fim do treino");
	}


}
