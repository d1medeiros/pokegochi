package pokegochi.teste;

import pokegochi.model.Jogador;

public class Teste {

	public static void main(String[] args) {

		
		Jogador j1 = new Jogador();
		j1.setNome("joo");
		j1.setTempoDeAtaque(1000);
		j1.setVida(10);
		
		Jogador j2 = new Jogador();
		j2.setNome("nii");
		j2.setTempoDeAtaque(7300);
		j2.setVida(40);
		
		j1.escolheTarget(j2);
		j2.escolheTarget(j1);
		new Thread(j1).start();
		new Thread(j2).start();
		
	}

}
