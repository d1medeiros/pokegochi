package pokegochi.model;

public class Ninjutsu implements Treinar{
	
	private String nomeTreino = "NINJUTSU";

	public void iniciarTreino(Jogador2 jogador) {
		System.out.println("iniciando treino de -> " + this.nomeTreino);
		try {
			jogador.getPokegochi().setDano(6);
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("          treino de -> " + this.nomeTreino + "   -> fim do treino");
	}


}
