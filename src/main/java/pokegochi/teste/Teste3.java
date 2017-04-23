package pokegochi.teste;

import pokegochi.controller.Alimentar;
import pokegochi.controller.Lutar;
import pokegochi.model.Jogador2;
import pokegochi.model.Macarronada;
import pokegochi.model.Ninjutsu;
import pokegochi.model.Pokegochi;
import pokegochi.model.Sumo;

public class Teste3 {

	public static void main(String[] args) {
		
		/** setagem inicial */
		Jogador2 j1 = new Jogador2();
		j1.setNome("Aulus Gordo");
		j1.setPokegochi(new Pokegochi());
		
		
		Jogador2 j2 = new Jogador2();
		j2.setNome("Begamo Magro");
		j2.setPokegochi(new Pokegochi());
		
		
		/** Treinamento dos jogadores 
		 * Os jogadores podem treinar 2x ao dia */
		//jogador 1
		Sumo sumo = new Sumo();
		int horas = 4;
		sumo.iniciarTreino(j1, horas);
		
		//jogador 2
		Ninjutsu ninjutsu = new Ninjutsu();
		horas = 6;
		ninjutsu.iniciarTreino(j2, horas);
		
		
		
		/** Alimentação	
		 * Os jogadores podem se alimentar de 4 a 6 vezes ao dia, com um intervalo de 3horas.
		 * Caso o pokegochi fique 3 dias sem comer, ele morre*/
		//jogador 1
		Alimentar a1 = new Alimentar();
		for (int i = 0; i < 20; i++) {
			a1.alimentar(j1, new Macarronada(), 1);
		}

		
		
		//jogador 2
		
		
		
		
		
		
		
		
		
		
		
		
		
//		/** Colocar os jogadores para lutar */
//		while(!j1.getAcabouTreino() && !j2.getAcabouTreino())
//			System.out.println("esperando fim de treinamento");
//		Lutar.inicia(j1, j2);
		
		
		
		
		
		
		
	}
	
}
