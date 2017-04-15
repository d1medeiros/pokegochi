package pokegochi.model;

public class Sumo implements Treinar{

	private String nomeTreino = "SUMO";

	public void iniciarTreino(Jogador2 jogador){
		System.out.println("iniciando treino de -> " + this.nomeTreino);
		try {
			jogador.getPokegochi().setDano(12);
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("          treino de -> " + this.nomeTreino + "   -> fim do treino");
	}

}
