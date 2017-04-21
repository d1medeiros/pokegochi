package pokegochi.teste;

import pokegochi.controller.Lutar;
import pokegochi.model.Jogador2;
import pokegochi.model.MonstroGordo;
import pokegochi.model.Sumo;

public class Teste3 {

	public static void main(String[] args) {
		
		/** setagem inicial */
		Jogador2 j1 = new Jogador2();
		j1.setNome("Aulus Gordo");
		j1.setPokegochi(new MonstroGordo());
		
		
		Jogador2 j2 = new Jogador2();
		j2.setNome("Begamo Magro");
		j2.setPokegochi(new MonstroGordo());
		
		
		/** Treinamento dos jogadores */
		//jogador 1
		Sumo sumo = new Sumo();
		int horas = 4;
		sumo.iniciarTreino(j1, horas);
		
		//jogador 2
		Sumo sumo2 = new Sumo();
		horas = 6;
		sumo.iniciarTreino(j2, horas);
		
		
		
		
		
		
		
		
		/** Colocar os jogadores para lutar */
		while(!j1.getAcabouTreino() && !j2.getAcabouTreino())
			System.out.println("esperando fim de treinamento");
		Lutar.inicia(j1, j2);
		
		
		
		
		
		
		
	}
	
}
