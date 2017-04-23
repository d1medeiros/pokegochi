package pokegochi.teste;

import pokegochi.controller.Alimentar;
import pokegochi.model.Jogador2;
import pokegochi.model.Pokegochi;
import pokegochi.model.Sumo;

public class Teste2 {

	public static void main(String[] args) {

		//iniciando jogadores
		Jogador2 j1 = new Jogador2();
		j1.setNome("Magro");
		j1.setPokegochi(new Pokegochi());
		
		Jogador2 j2 = new Jogador2();
		j2.setNome("Gordo");
		j2.setPokegochi(new Pokegochi());
		

		//alimentando
		
		
		
		//treinando
		Sumo sumo = new Sumo();
		sumo.iniciarTreino(j2, 4);
		

		
		//lutando
		j1.setTarget(j2);
		j2.setTarget(j1);
		new Thread(j1).start();
		new Thread(j2).start();
		
		
		System.out.println("fimmmmm");
		
	}

}
